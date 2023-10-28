# Import the necessary module
Import-Module -Name PSExcel

# Define the list of CSV files to be merged
$csvFiles = @("global_field_initialisations.csv", "options.csv", "cells.csv",
"cell_states.csv", "cell_state_params.csv", "fields.csv", "games.csv",
"global_actions.csv", "global_cell_states.csv")

# Define the path and name of the Excel file to be created
$excelFile = "C:\Users\auto1\go\src\github.com\eejai42\GridGames\SSoTme\SSoT\raw\merged_data.xlsx"
$emptyFile = "C:\Users\auto1\go\src\github.com\eejai42\GridGames\SSoTme\SSoT\raw\empty_data.xlsx"


$excel = New-Object -ComObject Excel.Application
$excel.Visible = $True
# $excel.Workbooks.Add($excelFile)
Remove-Item -Path $excelFile -Force
Copy-Item -Path $emptyFile -Destination $excelFile
$workbook = $excel.Workbooks.Open($excelFile)
foreach ($csvFile in $csvFiles) {
    Write-Host $csvFile
    $csvData = Import-Csv $csvFile    
    $worksheet = $workbook.Worksheets.Add()
    # $worksheet = $workbook.WorkSheets[$csvFile]
    $worksheet.Name = $csvFile
    # Define the starting cell for the data
    $startCell = $worksheet.Cells.Item(1,1)
    # Get the range of cells that the data will be written to
    $dataRange = $worksheet.Range($startCell, $startCell.Offset($csvData.Count -1, ($csvData[0] | Get-Member -MemberType NoteProperty | Select-Object -ExpandProperty Name).Count -1))
    # Write the data to the range of cells
    $dateRange|ConvertTo-Json|Out-Host
    $dataRange.Value2 = $csvData | %{$_.PSObject.Properties | %{$_.Value}}
}
$workbook.Save();
$excel.Quit()