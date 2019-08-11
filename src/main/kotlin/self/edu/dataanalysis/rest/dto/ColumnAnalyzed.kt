package self.edu.dataanalysis.rest.dto

class ColumnAnalyzed {

    var columnName: String
    var standardDeviation: Double
    var mean: Double

    constructor(columnName: String, standardDeviation: Double, mean: Double) {
        this.columnName = columnName
        this.standardDeviation = standardDeviation
        this.mean = mean
    }

}
