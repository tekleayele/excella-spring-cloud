package demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExcellaReportPojo {

    private int headCount;
    private double bdPipeline;
    private int recrutingPipeline;
    private double benchPluse;

    public int getHeadCount() {
        return headCount;
    }

    public void setHeadCount(int headCount) {
        this.headCount = headCount;
    }

    public double getBdPipeline() {
        return bdPipeline;
    }

    public void setBdPipeline(int bdPipeline) {
        this.bdPipeline = bdPipeline;
    }

    public int getRecrutingPipeline() {
        return recrutingPipeline;
    }

    public void setRecrutingPipeline(int recrutingPipeline) {
        this.recrutingPipeline = recrutingPipeline;
    }

    public double getBenchPluse() {
        return benchPluse;
    }

    public void setBenchPluse(double benchPluse) {
        this.benchPluse = benchPluse;
    }
}
