<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
                >
    <xsl:output method="xml" indent="yes"/>
    <xsl:include href="../CommonXsltTemplates.xslt"/>
    <xsl:param name="output-filename" select="'output.txt'" />

    <xsl:template match="@* | node()">
        <xsl:copy>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>
    <xsl:key name="field-by-name" match="/*/*" use="name()"/>
    <xsl:key name="field-by-name2" match="//*" use="name()"/>
    <xsl:variable name="objects" select="/*/*[generate-id() = generate-id(key('field-by-name', name())[1])]" />

    <xsl:template match="/">
        <FileSet>
            <FileSetFiles>
                <xsl:for-each select="$objects"><xsl:variable name="objectdef-name" select="name()" />
                    <FileSetFile>
                        <RelativePath>
                        <xsl:value-of select="name()" />
                        <xsl:text>.csv</xsl:text>
                    </RelativePath>
                    <xsl:element name="FileContents" xml:space="default"><xsl:variable name="objects" select="/*/*[name()=$objectdef-name]" />
                    <xsl:variable name="all-values" select="$objects/*" />
                    <xsl:variable name="unique-names1">
                        <xsl:call-template name="get-unique">
                            <xsl:with-param name="items" select="$all-values" />                        
                        </xsl:call-template>
                    </xsl:variable>
                    <xsl:variable name="unique-names" select="msxsl:node-set($unique-names1)/*"></xsl:variable>
                    <xsl:for-each select="$unique-names" xml:space="default">
                        <xsl:value-of select="text()" /><xsl:if test="position() != last()">,</xsl:if></xsl:for-each>
                        <xsl:text>&#10;</xsl:text>
                <xsl:for-each select="$objects" xml:space="default"><xsl:variable name="obj" select="." />
                    <xsl:for-each select="$unique-names" xml:space="default"><xsl:variable name="name" select="text()" />
                        <xsl:value-of select="$obj/*[name()=$name]" /><xsl:if test="position() != last()">,</xsl:if></xsl:for-each>
                        <xsl:text>&#10;</xsl:text>
                </xsl:for-each>
    </xsl:element>
            </FileSetFile>    
        </xsl:for-each>
        </FileSetFiles>
        </FileSet>
    </xsl:template>

    <xsl:template name="get-unique">
        <xsl:param name="items"></xsl:param>
        <xsl:variable name="value">
            <xsl:if test="count($items)>0">
                <xsl:value-of select="name($items[1])" />
            </xsl:if>
        </xsl:variable>
        <xsl:if test="count($items)>0">
            <item><xsl:value-of select="$value" /></item>
        </xsl:if>
        <xsl:if test="count($items)>1">
            <xsl:call-template name="get-unique">
                <xsl:with-param name="items" select="$items[name() != $value]"></xsl:with-param>
            </xsl:call-template>
        </xsl:if>        
    </xsl:template>
</xsl:stylesheet>
