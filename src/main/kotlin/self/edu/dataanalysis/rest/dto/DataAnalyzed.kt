package self.edu.dataanalysis.rest.dto

class DataAnalyzed {

    var fileName: String
    var columnsAnalyzed: List<ColumnAnalyzed>

    constructor(fileName: String, columnsAnalyzed: List<ColumnAnalyzed>) {
        this.fileName = fileName
        this.columnsAnalyzed = columnsAnalyzed
    }
}