// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class IceServer
{
    public final String password;
    public final String serverUrl;
    public final String username;
    
    public IceServer(final String s) {
        this(s, "", "");
    }
    
    public IceServer(final String serverUrl, final String username, final String password) {
        this.username = username;
        this.password = password;
        this.serverUrl = serverUrl;
    }
}
