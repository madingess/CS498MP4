package jenkins.model;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import jenkins.model.identity;
import hudson.model.JDK;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(CaseSensitive.class)
public class idFromFilenameTest {
    @Test
    public void correctBuf() {
        assertEqual(IdStrategy.idFromFileName("filename.txt"), "filename.txt");
    }
    
    @Test
    public void recognizeNonAlphanumeric() {
        assertEqual(IdStrategy.idFromFileName("\{}{]$^"), "\{}{]$^");
    }
    
}
