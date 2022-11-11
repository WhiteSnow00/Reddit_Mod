// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.apple;

import ak0.n;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class AppleDataRateBox extends AbstractFullBox
{
    public static final String TYPE = "rmdr";
    private static final /* synthetic */ a ajc$tjp_0;
    private long dataRate;
    
    static {
        ajc$preClinit();
    }
    
    public AppleDataRateBox() {
        super("rmdr");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("AppleDataRateBox.java", (Class)AppleDataRateBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getDataRate", "com.coremedia.iso.boxes.apple.AppleDataRateBox", "", "", "", "long"), 53);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.dataRate = c0.a0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.dataRate);
    }
    
    public long getContentSize() {
        return 8L;
    }
    
    public long getDataRate() {
        n.x(b.b(AppleDataRateBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.dataRate;
    }
}
