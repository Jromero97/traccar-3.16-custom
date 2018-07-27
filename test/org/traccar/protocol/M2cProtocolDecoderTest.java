package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class M2cProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        M2cProtocolDecoder decoder = new M2cProtocolDecoder(new M2cProtocol());

        verifyPositions(decoder, text(
                "[#M2C,2020,P1.B1.H3.F9.R1,102,864547034433966,1,L,0,20,171221,062016,28.647552,77.192841,0,0,0.0,0,0,64,255,11983,0,0,0,0.0,0,0,0,404,4,1F6,4D77,31,0*7524\r\n",
                "#M2C,2020,P1.B1.H3.F9.R1,102,864547034433966,2,L,0,20,171221,062019,28.647552,77.192841,0,0,0.0,0,0,64,255,11983,0,0,0,0.0,0,0,0,404,4,1F6,4D77,31,0*7528\r\n",
                "#M2C,2020,P1.B1.H3.F9.R1,102,864547034433966,3,L,0,20,171221,062024,28.647552,77.192841,0,0,0.0,0,0,64,255,16292,0,0,0,0.0,0,0,0,404,4,1F6,4D77,31,0*7523\r\n"));

        verifyPositions(decoder, text(
                "[#M2C,2020,P1.B1.H1.F1.R1,101,862462038980016,2,L,1,100,170704,074933,28.647556,77.192940,900,194,0.0,0,0,0,255,11942,0,0,0,0,0,0,0,0,30068,5051,0,0,1*8159\r\n"));

        verifyPositions(decoder, text(
                "[#M2C,2020,P1.B1.H1.F1.R1,101,862462038980016,7,L,0,31,170704,075905,28.647615,77.192970,300,260,0.0,6,7,3,255,11967,0,12,0,0,0,0,0,0,19500,5051,0,27,1*8234\r\n",
                "#M2C,2020,P1.B1.H1.F1.R1,101,862462038980016,8,L,0,33,170704,075905,28.647615,77.192970,300,260,0.0,6,7,0,255,11942,0,12,0,0,0,0,0,0,20300,5051,0,27,1*8217\r\n"));

    }

}
