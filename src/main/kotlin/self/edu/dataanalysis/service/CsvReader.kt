package self.edu.dataanalysis.service

import com.csvreader.CsvReader
import org.springframework.stereotype.Component
import java.io.ByteArrayInputStream
import java.io.InputStreamReader

@Component
class CsvReader {


    fun read(bytes: ByteArray): Unit {
        var csvReader = CsvReader(InputStreamReader(ByteArrayInputStream(bytes)))
        csvReader.readHeaders()

        var columnData = HashMap<String, MutableList<Any>>()
        var idData = HashMap<String, List<Any>>()

        while (csvReader.readRecord()) {
            var userId = ""
            var valuesForUser: MutableList<Any> = ArrayList()
            for (column in 0..csvReader.columnCount) {

                var currentColumn = csvReader.getHeader(column)
                var valuesForColumn = columnData.getOrDefault(currentColumn, ArrayList())
                var value = csvReader.get(column)
                userId = if (column == 0) value else userId
                valuesForColumn.add(value)
                columnData.put(currentColumn, valuesForColumn)

                valuesForUser.add(value)
                //print(csvReader.getHeader(column))
                //println(csvReader.get(column))
            }
            idData.put(userId, valuesForUser)
        }

        print("Finished!")
    }
}