package com.amdocs.jshapi.bamx;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"UserName",
"Pass",
"token",
"idBanco"
})
public class user {

@JsonProperty("UserName")
private String userName;
@JsonProperty("Pass")
private String pass;
@JsonProperty("token")
private String token;
@JsonProperty("idBanco")
private Integer idBanco;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("UserName")
public String getUserName() {
return userName;
}

@JsonProperty("UserName")
public void setUserName(String userName) {
this.userName = userName;
}

@JsonProperty("Pass")
public String getPass() {
return pass;
}

@JsonProperty("Pass")
public void setPass(String pass) {
this.pass = pass;
}

@JsonProperty("token")
public String getToken() {
return token;
}

@JsonProperty("token")
public void setToken(String token) {
this.token = token;
}

@JsonProperty("idBanco")
public Integer getIdBanco() {
return idBanco;
}

@JsonProperty("idBanco")
public void setIdBanco(Integer idBanco) {
this.idBanco = idBanco;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}