// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes.apple;

import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class AppleDataRateBox extends AbstractFullBox
{
    public static final String TYPE = "rmdr";
    private static final a ajc$tjp_0;
    private long dataRate;
    
    static {
        ajc$preClinit();
    }
    
    public AppleDataRateBox() {
        super("rmdr");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("AppleDataRateBox.java", (Class)AppleDataRateBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getDataRate", "com.coremedia.iso.boxes.apple.AppleDataRateBox", "", "", "", "long"), 53);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.dataRate = xd.a.U0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int)this.dataRate);
    }
    
    public long getContentSize() {
        return 8L;
    }
    
    public long getDataRate() {
        m5.a.s(b.b(AppleDataRateBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.dataRate;
    }
}
