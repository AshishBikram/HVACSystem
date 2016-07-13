package Service;

import org.apache.hadoop.fs.Path;

import java.io.File;

/**
 * Created by iam on 7/2/16.
 */

public class RemoteFile extends AbstractFileFetcher {

    private Path path;

    @Override
    public File getFile(String classifier) {
        Path filePath = null;
        if(classifier.equalsIgnoreCase("drill")){
            filePath = new Path("hdfs://localhost:9000/user/iam/input/firstResult.csv");
        }else{
            filePath = new Path("hdfs://localhost:9000/user/iam/secondResult.csv/part-r-00000");
        }
        setPath(filePath);
        return inputFile;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }


}
