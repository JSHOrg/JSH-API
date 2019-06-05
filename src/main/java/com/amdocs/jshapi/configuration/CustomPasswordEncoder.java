package com.amdocs.jshapi.configuration;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomPasswordEncoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		 System.out.println(rawPassword.toString());
		//String hashed = BCrypt.hashpw(rawPassword.toString(), BCrypt.gensalt(12));
		String hashed = sha1(rawPassword.toString());
        return hashed;
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		String deencoded =sha1(rawPassword.toString());
		return encodedPassword.equals(deencoded.toString());
	}
	
	public static String sha1(String toHash)
	{
	    String hash = null;
	    try
	    {
	        MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        byte[] bytes = toHash.getBytes("ASCII"); //I tried UTF-8, ISO-8859-1...
	        digest.update(bytes, 0, bytes.length);
	        bytes = digest.digest();
	        StringBuilder sb = new StringBuilder();
	        for(byte b : bytes)
	        {
	            sb.append(String.format("%02X", b));
	        }
	        hash = sb.toString();
	    }
	    catch(NoSuchAlgorithmException e)
	    {
	        e.printStackTrace();
	    }
	    catch(UnsupportedEncodingException e)
	    {
	        e.printStackTrace();
	    }
	    return hash.toLowerCase(Locale.ENGLISH);
	}

}
