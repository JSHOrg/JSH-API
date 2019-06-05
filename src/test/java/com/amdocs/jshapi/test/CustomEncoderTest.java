package com.amdocs.jshapi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.amdocs.jshapi.configuration.CustomPasswordEncoder;

public class CustomEncoderTest {

	@Test
    public void customEncoder() {
        CustomPasswordEncoder customPasswordEncoder = new CustomPasswordEncoder();
        String encoded = customPasswordEncoder.encode("bamx123");
        System.out.print(encoded);
        assertEquals( "638d0cd1ed9439efdca0dadde7fd69b8fcff7a3d" , encoded);
    }
	
	@Test
    public void customEncoderMatch() {
        CustomPasswordEncoder customPasswordEncoder = new CustomPasswordEncoder();
        CharSequence rawPassword = "bamx123";
        
        Boolean matches =  customPasswordEncoder.matches(rawPassword, "638d0cd1ed9439efdca0dadde7fd69b8fcff7a3d ");
          System.out.print(matches);
        assertEquals(true , matches);
    }
}
