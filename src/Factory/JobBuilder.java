package Factory;

public class JobBuilder extends CustomerBuilder{
    public JobBuilder(){
        super();
    }
    puiblic JobBuilder setJobId(int jobId){
        this.jobId = jobId;
        return this;
    }

}
