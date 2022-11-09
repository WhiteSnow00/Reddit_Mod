// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.n;
import ak0.m;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class PerformerBox extends AbstractFullBox
{
    public static final String TYPE = "perf";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private String language;
    private String performer;
    
    static {
        ajc$preClinit();
    }
    
    public PerformerBox() {
        super("perf");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("PerformerBox.java", (Class)PerformerBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 41);
        ajc$tjp_1 = (a)b.f(b.e("getPerformer", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 45);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.PerformerBox", "java.lang.String", "language", "", "void"), 49);
        ajc$tjp_3 = (a)b.f(b.e("setPerformer", "com.coremedia.iso.boxes.PerformerBox", "java.lang.String", "performer", "", "void"), 53);
        ajc$tjp_4 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 76);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = c0.U(byteBuffer);
        this.performer = c0.W(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        ah.a.l0(this.language, byteBuffer);
        m.A(this.performer, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return at1.a.m2(this.performer) + 6 + 1;
    }
    
    public String getLanguage() {
        n.x(b.b(PerformerBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public String getPerformer() {
        n.x(b.b(PerformerBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.performer;
    }
    
    public void setLanguage(final String language) {
        n.x(b.c(PerformerBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public void setPerformer(final String performer) {
        n.x(b.c(PerformerBox.ajc$tjp_3, (Object)this, (Object)this, (Object)performer));
        this.performer = performer;
    }
    
    public String toString() {
        final StringBuilder q = ag0.a.q(b.b(PerformerBox.ajc$tjp_4, (Object)this, (Object)this), "PerformerBox[language=");
        q.append(this.getLanguage());
        q.append(";performer=");
        q.append(this.getPerformer());
        q.append("]");
        return q.toString();
    }
}
