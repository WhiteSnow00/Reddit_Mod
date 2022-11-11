// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import androidx.appcompat.widget.s0;
import com.googlecode.mp4parser.e;
import ak0.n;
import o9.c;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class SchemeTypeBox extends AbstractFullBox
{
    public static final String TYPE = "schm";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private static final /* synthetic */ a ajc$tjp_5;
    private static final /* synthetic */ a ajc$tjp_6;
    public String schemeType;
    public String schemeUri;
    public long schemeVersion;
    
    static {
        ajc$preClinit();
    }
    
    public SchemeTypeBox() {
        super("schm");
        this.schemeType = "    ";
        this.schemeUri = null;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("SchemeTypeBox.java", (Class)SchemeTypeBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = (a)b.f(b.e("getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "long"), 48);
        ajc$tjp_2 = (a)b.f(b.e("getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = (a)b.f(b.e("setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"), 56);
        ajc$tjp_4 = (a)b.f(b.e("setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "int", "schemeVersion", "", "void"), 61);
        ajc$tjp_5 = (a)b.f(b.e("setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"), 65);
        ajc$tjp_6 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.schemeType = c0.Q(byteBuffer);
        this.schemeVersion = c0.a0(byteBuffer);
        if ((this.getFlags() & 0x1) == 0x1) {
            this.schemeUri = c0.W(byteBuffer);
        }
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(c.f(this.schemeType));
        byteBuffer.putInt((int)this.schemeVersion);
        if ((this.getFlags() & 0x1) == 0x1) {
            byteBuffer.put(at1.a.f0(this.schemeUri));
        }
    }
    
    public long getContentSize() {
        int n;
        if ((this.getFlags() & 0x1) == 0x1) {
            n = at1.a.m2(this.schemeUri) + 1;
        }
        else {
            n = 0;
        }
        return n + 12;
    }
    
    public String getSchemeType() {
        n.x(b.b(SchemeTypeBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.schemeType;
    }
    
    public String getSchemeUri() {
        n.x(b.b(SchemeTypeBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.schemeUri;
    }
    
    public long getSchemeVersion() {
        n.x(b.b(SchemeTypeBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.schemeVersion;
    }
    
    public void setSchemeType(final String schemeType) {
        n.x(b.c(SchemeTypeBox.ajc$tjp_3, (Object)this, (Object)this, (Object)schemeType));
        this.schemeType = schemeType;
    }
    
    public void setSchemeUri(final String schemeUri) {
        n.x(b.c(SchemeTypeBox.ajc$tjp_5, (Object)this, (Object)this, (Object)schemeUri));
        this.schemeUri = schemeUri;
    }
    
    public void setSchemeVersion(final int n) {
        n.x(b.c(SchemeTypeBox.ajc$tjp_4, (Object)this, (Object)this, (Object)new Integer(n)));
        this.schemeVersion = n;
    }
    
    public String toString() {
        final yt2.c b = yt2.b.b(SchemeTypeBox.ajc$tjp_6, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("Schema Type Box[");
        sb.append("schemeUri=");
        s0.v(sb, this.schemeUri, "; ", "schemeType=");
        s0.v(sb, this.schemeType, "; ", "schemeVersion=");
        sb.append(this.schemeVersion);
        sb.append("; ");
        sb.append("]");
        return sb.toString();
    }
}
