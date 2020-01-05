package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {
    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/home/dave/foo");
        assertEquals(uploadPage.getUploadedFilename(), "foo", "Filename doesn't match");
    }
}
