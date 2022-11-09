// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector;

import java.io.IOException;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.http.HttpHandler;
import com.facebook.stetho.server.http.PathMatcher;
import com.facebook.stetho.websocket.SimpleEndpoint;
import com.facebook.stetho.websocket.WebSocketHandler;
import com.facebook.stetho.server.http.ExactPathMatcher;
import com.facebook.stetho.server.http.HandlerRegistry;
import com.facebook.stetho.server.http.LightHttpServer;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import android.content.Context;
import com.facebook.stetho.server.SocketLikeHandler;

public class DevtoolsSocketHandler implements SocketLikeHandler
{
    private final Context mContext;
    private final Iterable<ChromeDevtoolsDomain> mModules;
    private final LightHttpServer mServer;
    
    public DevtoolsSocketHandler(final Context mContext, final Iterable<ChromeDevtoolsDomain> mModules) {
        this.mContext = mContext;
        this.mModules = mModules;
        this.mServer = this.createServer();
    }
    
    private LightHttpServer createServer() {
        final HandlerRegistry handlerRegistry = new HandlerRegistry();
        new ChromeDiscoveryHandler(this.mContext, "/inspector").register(handlerRegistry);
        handlerRegistry.register((PathMatcher)new ExactPathMatcher("/inspector"), (HttpHandler)new WebSocketHandler((SimpleEndpoint)new ChromeDevtoolsServer(this.mModules)));
        return new LightHttpServer(handlerRegistry);
    }
    
    @Override
    public void onAccepted(final SocketLike socketLike) throws IOException {
        this.mServer.serve(socketLike);
    }
}
