// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.n;
import o9.c;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class HandlerBox extends AbstractFullBox
{
    public static final String TYPE = "hdlr";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private static final /* synthetic */ a ajc$tjp_5;
    public static final Map<String, String> readableTypes;
    private long a;
    private long b;
    private long c;
    private String handlerType;
    private String name;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm;
    
    static {
        ajc$preClinit();
        final HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        readableTypes = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public HandlerBox() {
        super("hdlr");
        this.name = null;
        this.zeroTerm = true;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("HandlerBox.java", (Class)HandlerBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_1 = (a)b.f(b.e("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"), 87);
        ajc$tjp_2 = (a)b.f(b.e("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"), 91);
        ajc$tjp_3 = (a)b.f(b.e("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        ajc$tjp_4 = (a)b.f(b.e("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        ajc$tjp_5 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.shouldBeZeroButAppleWritesHereSomeValue = c0.a0(byteBuffer);
        this.handlerType = c0.Q(byteBuffer);
        this.a = c0.a0(byteBuffer);
        this.b = c0.a0(byteBuffer);
        this.c = c0.a0(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            final String x = c0.X(byteBuffer, byteBuffer.remaining());
            this.name = x;
            if (x.endsWith("\u0000")) {
                final String name = this.name;
                this.name = name.substring(0, name.length() - 1);
                this.zeroTerm = true;
            }
            else {
                this.zeroTerm = false;
            }
        }
        else {
            this.zeroTerm = false;
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.shouldBeZeroButAppleWritesHereSomeValue);
        byteBuffer.put(o9.c.f(this.handlerType));
        byteBuffer.putInt((int)this.a);
        byteBuffer.putInt((int)this.b);
        byteBuffer.putInt((int)this.c);
        final String name = this.name;
        if (name != null) {
            byteBuffer.put(at1.a.f0(name));
        }
        if (this.zeroTerm) {
            byteBuffer.put((byte)0);
        }
    }
    
    public long getContentSize() {
        int n;
        if (this.zeroTerm) {
            n = at1.a.m2(this.name) + 25;
        }
        else {
            n = at1.a.m2(this.name) + 24;
        }
        return n;
    }
    
    public String getHandlerType() {
        n.x(yt2.b.b(HandlerBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.handlerType;
    }
    
    public String getHumanReadableTrackType() {
        n.x(yt2.b.b(HandlerBox.ajc$tjp_4, (Object)this, (Object)this));
        final Map<String, String> readableTypes = HandlerBox.readableTypes;
        String s;
        if (readableTypes.get(this.handlerType) != null) {
            s = readableTypes.get(this.handlerType);
        }
        else {
            s = "Unknown Handler Type";
        }
        return s;
    }
    
    public String getName() {
        n.x(yt2.b.b(HandlerBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.name;
    }
    
    public void setHandlerType(final String handlerType) {
        n.x(yt2.b.c(HandlerBox.ajc$tjp_2, (Object)this, (Object)this, (Object)handlerType));
        this.handlerType = handlerType;
    }
    
    public void setName(final String name) {
        n.x(yt2.b.c(HandlerBox.ajc$tjp_1, (Object)this, (Object)this, (Object)name));
        this.name = name;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(yt2.b.b(HandlerBox.ajc$tjp_5, (Object)this, (Object)this), "HandlerBox[handlerType=");
        q.append(this.getHandlerType());
        q.append(";name=");
        q.append(this.getName());
        q.append("]");
        return q.toString();
    }
}
