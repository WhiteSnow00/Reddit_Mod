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

public class ClassificationBox extends AbstractFullBox
{
    public static final String TYPE = "clsf";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public ClassificationBox() {
        super("clsf");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("ClassificationBox.java", (Class)ClassificationBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getLanguage", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = (a)b.f(b.e("getClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 48);
        ajc$tjp_2 = (a)b.f(b.e("getClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "int"), 52);
        ajc$tjp_3 = (a)b.f(b.e("getClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 56);
        ajc$tjp_4 = (a)b.f(b.e("setClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"), 60);
        ajc$tjp_5 = (a)b.f(b.e("setClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "int", "classificationTableIndex", "", "void"), 64);
        ajc$tjp_6 = (a)b.f(b.e("setLanguage", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "language", "", "void"), 68);
        ajc$tjp_7 = (a)b.f(b.e("setClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"), 72);
        ajc$tjp_8 = (a)b.f(b.e("toString", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 101);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final byte[] array = new byte[4];
        byteBuffer.get(array);
        this.classificationEntity = c.b(array);
        this.classificationTableIndex = xd.a.S0(byteBuffer);
        this.language = xd.a.O0(byteBuffer);
        this.classificationInfo = xd.a.Q0(byteBuffer);
    }
    
    public String getClassificationEntity() {
        m5.a.s(b.b(ClassificationBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.classificationEntity;
    }
    
    public String getClassificationInfo() {
        m5.a.s(b.b(ClassificationBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.classificationInfo;
    }
    
    public int getClassificationTableIndex() {
        m5.a.s(b.b(ClassificationBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.classificationTableIndex;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(c.d(this.classificationEntity));
        if0.a.m0(this.classificationTableIndex, byteBuffer);
        if0.a.l0(this.language, byteBuffer);
        android.support.v4.media.a.D(this.classificationInfo, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return l0.s1(this.classificationInfo) + 8 + 1;
    }
    
    public String getLanguage() {
        m5.a.s(b.b(ClassificationBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setClassificationEntity(final String classificationEntity) {
        m5.a.s(b.c(ClassificationBox.ajc$tjp_4, (Object)this, (Object)this, (Object)classificationEntity));
        this.classificationEntity = classificationEntity;
    }
    
    public void setClassificationInfo(final String classificationInfo) {
        m5.a.s(b.c(ClassificationBox.ajc$tjp_7, (Object)this, (Object)this, (Object)classificationInfo));
        this.classificationInfo = classificationInfo;
    }
    
    public void setClassificationTableIndex(final int classificationTableIndex) {
        m5.a.s(b.c(ClassificationBox.ajc$tjp_5, (Object)this, (Object)this, (Object)new Integer(classificationTableIndex)));
        this.classificationTableIndex = classificationTableIndex;
    }
    
    public void setLanguage(final String language) {
        m5.a.s(b.c(ClassificationBox.ajc$tjp_6, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final mt2.c b = mt2.b.b(ClassificationBox.ajc$tjp_8, (Object)this, (Object)this);
        e.a().getClass();
        e.b(b);
        final StringBuilder sb = new StringBuilder();
        sb.append("ClassificationBox[language=");
        sb.append(this.getLanguage());
        sb.append("classificationEntity=");
        sb.append(this.getClassificationEntity());
        sb.append(";classificationTableIndex=");
        sb.append(this.getClassificationTableIndex());
        sb.append(";language=");
        sb.append(this.getLanguage());
        sb.append(";classificationInfo=");
        sb.append(this.getClassificationInfo());
        sb.append("]");
        return sb.toString();
    }
}
