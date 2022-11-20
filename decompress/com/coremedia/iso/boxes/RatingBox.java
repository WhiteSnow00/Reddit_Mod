// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.e;
import dg.l0;
import o9.c;
import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class RatingBox extends AbstractFullBox
{
    public static final String TYPE = "rtng";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;
    
    static {
        ajc$preClinit();
    }
    
    public RatingBox() {
        super("rtng");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("RatingBox.java", (Class)RatingBox.class);
        ajc$tjp_0 = (a)b.f(b.e("setRatingEntity", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingEntity", "", "void"), 46);
        ajc$tjp_1 = (a)b.f(b.e("setRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingCriteria", "", "void"), 50);
        ajc$tjp_2 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = (a)b.f(b.e("setRatingInfo", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingInfo", "", "void"), 58);
        ajc$tjp_4 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = (a)b.f(b.e("getRatingEntity", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 73);
        ajc$tjp_6 = (a)b.f(b.e("getRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_7 = (a)b.f(b.e("getRatingInfo", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 87);
        ajc$tjp_8 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 115);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.ratingEntity = xd.a.J0(byteBuffer);
        this.ratingCriteria = xd.a.J0(byteBuffer);
        this.language = xd.a.O0(byteBuffer);
        this.ratingInfo = xd.a.Q0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(c.d(this.ratingEntity));
        byteBuffer.put(c.d(this.ratingCriteria));
        if0.a.l0(this.language, byteBuffer);
        android.support.v4.media.a.D(this.ratingInfo, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return l0.s1(this.ratingInfo) + 15;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(RatingBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.language;
    }
    
    public String getRatingCriteria() {
        m5.a.s(b.b(RatingBox.ajc$tjp_6, (Object)this, (Object)this));
        return this.ratingCriteria;
    }
    
    public String getRatingEntity() {
        m5.a.s(b.b(RatingBox.ajc$tjp_5, (Object)this, (Object)this));
        return this.ratingEntity;
    }
    
    public String getRatingInfo() {
        m5.a.s(b.b(RatingBox.ajc$tjp_7, (Object)this, (Object)this));
        return this.ratingInfo;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(RatingBox.ajc$tjp_2, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public void setRatingCriteria(final String ratingCriteria) {
        m5.a.s(b.c(RatingBox.ajc$tjp_1, (Object)this, (Object)this, (Object)ratingCriteria));
        this.ratingCriteria = ratingCriteria;
    }
    
    public void setRatingEntity(final String ratingEntity) {
        m5.a.s(b.c(RatingBox.ajc$tjp_0, (Object)this, (Object)this, (Object)ratingEntity));
        this.ratingEntity = ratingEntity;
    }
    
    public void setRatingInfo(final String ratingInfo) {
        m5.a.s(b.c(RatingBox.ajc$tjp_3, (Object)this, (Object)this, (Object)ratingInfo));
        this.ratingInfo = ratingInfo;
    }
    
    public String toString() {
        final mt2.c b = mt2.b.b(RatingBox.ajc$tjp_8, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("RatingBox[language=");
        sb.append(this.getLanguage());
        sb.append("ratingEntity=");
        sb.append(this.getRatingEntity());
        sb.append(";ratingCriteria=");
        sb.append(this.getRatingCriteria());
        sb.append(";language=");
        sb.append(this.getLanguage());
        sb.append(";ratingInfo=");
        sb.append(this.getRatingInfo());
        sb.append("]");
        return sb.toString();
    }
}
