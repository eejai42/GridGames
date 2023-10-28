$excel = New-Object -ComObject Excel.Application
$excel.Visible = $true
$wb = $excel.Workbooks.Add()
$CSVPath = "C:\Users\auto1\go\src\github.com\eejai42\GridGames\SSoTme\SSoT\raw"

Get-ChildItem $CSVPath\*.csv | ForEach-Object {
    WRite-Host $_.FullName
    if ((Import-Csv $_.FullName).Length -gt 0) {
        $csvBook = $excel.Workbooks.Open($_.FullName)
        $csvBook.ActiveSheet.Copy($wb.Worksheets($wb.Worksheets.Count))
        $csvBook.Close()
    }
}

$excel.Quit();
