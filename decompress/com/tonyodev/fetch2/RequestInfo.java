// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2;

import kotlin.TypeCastException;
import ng2.e;
import pd2.b;
import java.util.LinkedHashMap;
import java.util.Map;
import com.tonyodev.fetch2core.Extras;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bK\u0010LJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010A\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0016\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u0010\u001aR*\u0010E\u001a\u00020D2\u0006\u0010\u0004\u001a\u00020D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006M" }, d2 = { "Lcom/tonyodev/fetch2/RequestInfo;", "Ljava/io/Serializable;", "", "key", "value", "Lcg2/j;", "addHeader", "", "other", "", "equals", "", "hashCode", "toString", "", "identifier", "J", "getIdentifier", "()J", "setIdentifier", "(J)V", "groupId", "I", "getGroupId", "()I", "setGroupId", "(I)V", "", "headers", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "Lcom/tonyodev/fetch2/Priority;", "priority", "Lcom/tonyodev/fetch2/Priority;", "getPriority", "()Lcom/tonyodev/fetch2/Priority;", "setPriority", "(Lcom/tonyodev/fetch2/Priority;)V", "Lcom/tonyodev/fetch2/NetworkType;", "networkType", "Lcom/tonyodev/fetch2/NetworkType;", "getNetworkType", "()Lcom/tonyodev/fetch2/NetworkType;", "setNetworkType", "(Lcom/tonyodev/fetch2/NetworkType;)V", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "Lcom/tonyodev/fetch2/EnqueueAction;", "enqueueAction", "Lcom/tonyodev/fetch2/EnqueueAction;", "getEnqueueAction", "()Lcom/tonyodev/fetch2/EnqueueAction;", "setEnqueueAction", "(Lcom/tonyodev/fetch2/EnqueueAction;)V", "downloadOnEnqueue", "Z", "getDownloadOnEnqueue", "()Z", "setDownloadOnEnqueue", "(Z)V", "autoRetryMaxAttempts", "getAutoRetryMaxAttempts", "setAutoRetryMaxAttempts", "Lcom/tonyodev/fetch2core/Extras;", "extras", "Lcom/tonyodev/fetch2core/Extras;", "getExtras", "()Lcom/tonyodev/fetch2core/Extras;", "setExtras", "(Lcom/tonyodev/fetch2core/Extras;)V", "<init>", "()V", "fetch2_release" }, k = 1, mv = { 1, 4, 0 })
public class RequestInfo implements Serializable
{
    private int autoRetryMaxAttempts;
    private boolean downloadOnEnqueue;
    private EnqueueAction enqueueAction;
    private Extras extras;
    private int groupId;
    private final Map<String, String> headers;
    private long identifier;
    private NetworkType networkType;
    private Priority priority;
    private String tag;
    
    public RequestInfo() {
        this.headers = new LinkedHashMap<String, String>();
        this.priority = b.c;
        this.networkType = b.a;
        this.enqueueAction = b.g;
        this.downloadOnEnqueue = true;
        Extras.CREATOR.getClass();
        this.extras = Extras.access$getEmptyExtras$cp();
    }
    
    public final void addHeader(final String s, final String s2) {
        e.g((Object)s, "key");
        e.g((Object)s2, "value");
        this.headers.put(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends RequestInfo> class1 = this.getClass();
        Class<?> class2;
        if (o != null) {
            class2 = o.getClass();
        }
        else {
            class2 = null;
        }
        if (e.a((Object)class1, (Object)class2) ^ true) {
            return false;
        }
        if (o != null) {
            final RequestInfo requestInfo = (RequestInfo)o;
            return this.identifier == requestInfo.identifier && this.groupId == requestInfo.groupId && !(e.a((Object)this.headers, (Object)requestInfo.headers) ^ true) && this.priority == requestInfo.priority && this.networkType == requestInfo.networkType && !(e.a((Object)this.tag, (Object)requestInfo.tag) ^ true) && this.enqueueAction == requestInfo.enqueueAction && this.downloadOnEnqueue == requestInfo.downloadOnEnqueue && !(e.a((Object)this.extras, (Object)requestInfo.extras) ^ true) && this.autoRetryMaxAttempts == requestInfo.autoRetryMaxAttempts;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2.RequestInfo");
    }
    
    public final int getAutoRetryMaxAttempts() {
        return this.autoRetryMaxAttempts;
    }
    
    public final boolean getDownloadOnEnqueue() {
        return this.downloadOnEnqueue;
    }
    
    public final EnqueueAction getEnqueueAction() {
        return this.enqueueAction;
    }
    
    public final Extras getExtras() {
        return this.extras;
    }
    
    public final int getGroupId() {
        return this.groupId;
    }
    
    public final Map<String, String> getHeaders() {
        return this.headers;
    }
    
    public final long getIdentifier() {
        return this.identifier;
    }
    
    public final NetworkType getNetworkType() {
        return this.networkType;
    }
    
    public final Priority getPriority() {
        return this.priority;
    }
    
    public final String getTag() {
        return this.tag;
    }
    
    @Override
    public int hashCode() {
        final int c = d.c((Map)this.headers, (Long.valueOf(this.identifier).hashCode() * 31 + this.groupId) * 31, 31);
        final int hashCode = this.priority.hashCode();
        final int hashCode2 = this.networkType.hashCode();
        final String tag = this.tag;
        int hashCode3;
        if (tag != null) {
            hashCode3 = tag.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (this.extras.hashCode() + (Boolean.valueOf(this.downloadOnEnqueue).hashCode() + (this.enqueueAction.hashCode() + ((hashCode2 + (hashCode + c) * 31) * 31 + hashCode3) * 31) * 31) * 31) * 31 + this.autoRetryMaxAttempts;
    }
    
    public final void setAutoRetryMaxAttempts(final int autoRetryMaxAttempts) {
        if (autoRetryMaxAttempts >= 0) {
            this.autoRetryMaxAttempts = autoRetryMaxAttempts;
            return;
        }
        throw new IllegalArgumentException("The maximum number of attempts has to be greater than -1");
    }
    
    public final void setDownloadOnEnqueue(final boolean downloadOnEnqueue) {
        this.downloadOnEnqueue = downloadOnEnqueue;
    }
    
    public final void setEnqueueAction(final EnqueueAction enqueueAction) {
        e.g((Object)enqueueAction, "<set-?>");
        this.enqueueAction = enqueueAction;
    }
    
    public final void setExtras(final Extras extras) {
        e.g((Object)extras, "value");
        this.extras = extras.copy();
    }
    
    public final void setGroupId(final int groupId) {
        this.groupId = groupId;
    }
    
    public final void setIdentifier(final long identifier) {
        this.identifier = identifier;
    }
    
    public final void setNetworkType(final NetworkType networkType) {
        e.g((Object)networkType, "<set-?>");
        this.networkType = networkType;
    }
    
    public final void setPriority(final Priority priority) {
        e.g((Object)priority, "<set-?>");
        this.priority = priority;
    }
    
    public final void setTag(final String tag) {
        this.tag = tag;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("RequestInfo(identifier=");
        t.append(this.identifier);
        t.append(", groupId=");
        t.append(this.groupId);
        t.append(',');
        t.append(" headers=");
        t.append(this.headers);
        t.append(", priority=");
        t.append(this.priority);
        t.append(", networkType=");
        t.append(this.networkType);
        t.append(',');
        t.append(" tag=");
        t.append(this.tag);
        t.append(", enqueueAction=");
        t.append(this.enqueueAction);
        t.append(", downloadOnEnqueue=");
        t.append(this.downloadOnEnqueue);
        t.append(", ");
        t.append("autoRetryMaxAttempts=");
        t.append(this.autoRetryMaxAttempts);
        t.append(", extras=");
        t.append(this.extras);
        t.append(')');
        return t.toString();
    }
}
