// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.Iterator;
import java.util.ArrayList;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import org.json.JSONObject;
import com.facebook.stetho.common.ProcessUtil;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Collections;
import com.facebook.stetho.inspector.screencast.ScreencastDispatcher;
import com.facebook.stetho.json.ObjectMapper;
import android.content.Context;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class Page implements ChromeDevtoolsDomain
{
    public static final String BANNER = "_____/\\\\\\\\\\\\\\\\\\\\\\_______________________________________________/\\\\\\_______________________\n ___/\\\\\\/////////\\\\\\____________________________________________\\/\\\\\\_______________________\n  __\\//\\\\\\______\\///______/\\\\\\_________________________/\\\\\\______\\/\\\\\\_______________________\n   ___\\////\\\\\\__________/\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_____________/\\\\\\\\\\____\n    ______\\////\\\\\\______\\////\\\\\\////____/\\\\\\/////\\\\\\_\\////\\\\\\////__\\/\\\\\\\\\\\\\\\\\\\\____/\\\\\\///\\\\\\__\n     _________\\////\\\\\\______\\/\\\\\\_______/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______\\/\\\\\\/////\\\\\\__/\\\\\\__\\//\\\\\\_\n      __/\\\\\\______\\//\\\\\\_____\\/\\\\\\_/\\\\__\\//\\\\///////______\\/\\\\\\_/\\\\__\\/\\\\\\___\\/\\\\\\_\\//\\\\\\__/\\\\\\__\n       _\\///\\\\\\\\\\\\\\\\\\\\\\/______\\//\\\\\\\\\\____\\//\\\\\\\\\\\\\\\\\\\\____\\//\\\\\\\\\\___\\/\\\\\\___\\/\\\\\\__\\///\\\\\\\\\\/___\n        ___\\///////////_________\\/////______\\//////////______\\/////____\\///____\\///_____\\/////_____\n         Welcome to Stetho";
    private final Context mContext;
    private final String mMessage;
    private final ObjectMapper mObjectMapper;
    private ScreencastDispatcher mScreencastDispatcher;
    
    public Page(final Context context) {
        this(context, "_____/\\\\\\\\\\\\\\\\\\\\\\_______________________________________________/\\\\\\_______________________\n ___/\\\\\\/////////\\\\\\____________________________________________\\/\\\\\\_______________________\n  __\\//\\\\\\______\\///______/\\\\\\_________________________/\\\\\\______\\/\\\\\\_______________________\n   ___\\////\\\\\\__________/\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_____________/\\\\\\\\\\____\n    ______\\////\\\\\\______\\////\\\\\\////____/\\\\\\/////\\\\\\_\\////\\\\\\////__\\/\\\\\\\\\\\\\\\\\\\\____/\\\\\\///\\\\\\__\n     _________\\////\\\\\\______\\/\\\\\\_______/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______\\/\\\\\\/////\\\\\\__/\\\\\\__\\//\\\\\\_\n      __/\\\\\\______\\//\\\\\\_____\\/\\\\\\_/\\\\__\\//\\\\///////______\\/\\\\\\_/\\\\__\\/\\\\\\___\\/\\\\\\_\\//\\\\\\__/\\\\\\__\n       _\\///\\\\\\\\\\\\\\\\\\\\\\/______\\//\\\\\\\\\\____\\//\\\\\\\\\\\\\\\\\\\\____\\//\\\\\\\\\\___\\/\\\\\\___\\/\\\\\\__\\///\\\\\\\\\\/___\n        ___\\///////////_________\\/////______\\//////////______\\/////____\\///____\\///_____\\/////_____\n         Welcome to Stetho");
    }
    
    public Page(final Context mContext, final String mMessage) {
        this.mObjectMapper = new ObjectMapper();
        this.mContext = mContext;
        this.mMessage = mMessage;
    }
    
    private static Page$FrameResourceTree createSimpleFrameResourceTree(final String id, final String parentId, final String name, final String securityOrigin) {
        final Page.Page$Frame frame = new Page.Page$Frame((Page$1)null);
        frame.id = id;
        frame.parentId = parentId;
        frame.loaderId = "1";
        frame.name = name;
        frame.url = "";
        frame.securityOrigin = securityOrigin;
        frame.mimeType = "text/plain";
        final Page$FrameResourceTree page$FrameResourceTree = new Page$FrameResourceTree((Page$1)null);
        page$FrameResourceTree.frame = frame;
        page$FrameResourceTree.resources = Collections.emptyList();
        page$FrameResourceTree.childFrames = null;
        return page$FrameResourceTree;
    }
    
    private void notifyExecutionContexts(final JsonRpcPeer jsonRpcPeer) {
        final Page.Page$ExecutionContextDescription context = new Page.Page$ExecutionContextDescription((Page$1)null);
        context.frameId = "1";
        context.id = 1;
        final Page.Page$ExecutionContextCreatedParams page$ExecutionContextCreatedParams = new Page.Page$ExecutionContextCreatedParams((Page$1)null);
        page$ExecutionContextCreatedParams.context = context;
        jsonRpcPeer.invokeMethod("Runtime.executionContextCreated", (Object)page$ExecutionContextCreatedParams, (PendingRequestCallback)null);
    }
    
    private void sendWelcomeMessage(final JsonRpcPeer jsonRpcPeer) {
        final Console$ConsoleMessage message = new Console$ConsoleMessage();
        message.source = Console$MessageSource.JAVASCRIPT;
        message.level = Console$MessageLevel.LOG;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.mMessage);
        sb.append("\n          Attached to ");
        sb.append(ProcessUtil.getProcessName());
        sb.append("\n");
        message.text = sb.toString();
        final Console$MessageAddedRequest console$MessageAddedRequest = new Console$MessageAddedRequest();
        console$MessageAddedRequest.message = message;
        jsonRpcPeer.invokeMethod("Console.messageAdded", (Object)console$MessageAddedRequest, (PendingRequestCallback)null);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult canScreencast(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        return (JsonRpcResult)new SimpleBooleanResult(true);
    }
    
    @ChromeDevtoolsMethod
    public void clearDeviceOrientationOverride(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void clearGeolocationOverride(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void disable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void enable(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        this.notifyExecutionContexts(jsonRpcPeer);
        this.sendWelcomeMessage(jsonRpcPeer);
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult getResourceTree(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final Iterator iterator = SharedPreferencesHelper.getSharedPreferenceTags(this.mContext).iterator();
        String s;
        if (iterator.hasNext()) {
            s = (String)iterator.next();
        }
        else {
            s = "";
        }
        final Page$FrameResourceTree simpleFrameResourceTree = createSimpleFrameResourceTree("1", null, "Stetho", s);
        if (simpleFrameResourceTree.childFrames == null) {
            simpleFrameResourceTree.childFrames = new ArrayList();
        }
        int n = 1;
        while (iterator.hasNext()) {
            final StringBuilder t = a.t("1.");
            t.append(n);
            final String string = t.toString();
            simpleFrameResourceTree.childFrames.add(createSimpleFrameResourceTree(string, "1", b.l("Child #", string), (String)iterator.next()));
            ++n;
        }
        final GetResourceTreeParams getResourceTreeParams = new GetResourceTreeParams(null);
        getResourceTreeParams.frameTree = simpleFrameResourceTree;
        return (JsonRpcResult)getResourceTreeParams;
    }
    
    @ChromeDevtoolsMethod
    public JsonRpcResult hasTouchInputs(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        return (JsonRpcResult)new SimpleBooleanResult(false);
    }
    
    @ChromeDevtoolsMethod
    public void screencastFrameAck(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void setDeviceMetricsOverride(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void setEmulatedMedia(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void setShowViewportSizeOnResize(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void setTouchEmulationEnabled(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
    }
    
    @ChromeDevtoolsMethod
    public void startScreencast(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final Page.Page$StartScreencastRequest page$StartScreencastRequest = (Page.Page$StartScreencastRequest)this.mObjectMapper.convertValue((Object)jsonObject, (Class)Page.Page$StartScreencastRequest.class);
        if (this.mScreencastDispatcher == null) {
            (this.mScreencastDispatcher = new ScreencastDispatcher()).startScreencast(jsonRpcPeer, page$StartScreencastRequest);
        }
    }
    
    @ChromeDevtoolsMethod
    public void stopScreencast(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) {
        final ScreencastDispatcher mScreencastDispatcher = this.mScreencastDispatcher;
        if (mScreencastDispatcher != null) {
            mScreencastDispatcher.stopScreencast();
            this.mScreencastDispatcher = null;
        }
    }
    
    public static class GetResourceTreeParams implements JsonRpcResult
    {
        @JsonProperty(required = true)
        public Page$FrameResourceTree frameTree;
        
        private GetResourceTreeParams() {
        }
        
        public GetResourceTreeParams(final Page$1 page$1) {
            this();
        }
    }
}
