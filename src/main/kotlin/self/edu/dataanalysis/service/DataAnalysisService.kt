package self.edu.dataanalysis.service

import org.springframework.stereotype.Service
import self.edu.dataanalysis.rest.dto.DataAnalyzed
import java.util.*

@Service
public class DataAnalysisService(private val csvReader: CsvReader) {

    fun getAnalysis(bytes: ByteArray) : DataAnalyzed {
        csvReader.read(bytes)
        return DataAnalyzed("fileName", Collections.emptyList())
    }


}