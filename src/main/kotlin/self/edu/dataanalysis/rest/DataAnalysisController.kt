package self.edu.dataanalysis.rest

import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile
import self.edu.dataanalysis.rest.dto.DataAnalyzed
import self.edu.dataanalysis.service.DataAnalysisService

@RestController(value = "analysis")
@Api(value = "Analysis", description = "Rest API for Data Analysis", tags = arrayOf("Analysis API"))
public class DataAnalysisController(private val service: DataAnalysisService) {

    @PostMapping
    fun getAnalysis(@RequestParam("file") file: MultipartFile) : DataAnalyzed {
        println(file.contentType)
        println(file.originalFilename)
        println(file.size)
        return service.getAnalysis(file.bytes)
    }
}
