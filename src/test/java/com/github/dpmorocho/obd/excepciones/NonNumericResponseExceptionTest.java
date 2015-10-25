package com.github.dpmorocho.obd.excepciones;

import static org.powermock.api.easymock.PowerMock.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dpmorocho.obd.comandos.SpeedCommand;
import com.github.dpmorocho.obd.excepciones.NonNumericResponseException;

/**
 * Test results with echo on and off.
 */
@PrepareForTest(InputStream.class)
public class NonNumericResponseExceptionTest {

    private SpeedCommand command;
    private InputStream mockIn;

    /**
     * @throws Exception
     */
    @BeforeMethod
    public void setUp() throws Exception {
        command = new SpeedCommand();
    }

    /**
     * Test for valid InputStream read with echo
     *
     * @throws java.io.IOException, java.lang.InterruptedException
     */
    @Test(expectedExceptions = NonNumericResponseException.class)
    public void testValidSpeedMetricWithMessage() throws IOException, InterruptedException {
        // mock InputStream read
        mockIn = createMock(InputStream.class);
        mockIn.read();
        expectLastCall().andReturn((byte) 'O');
        expectLastCall().andReturn((byte) 'K');
        expectLastCall().andReturn((byte) '>');

        replayAll();

        // call the method to test
        command.run(mockIn, new ByteArrayOutputStream());

        verifyAll();
    }

}
