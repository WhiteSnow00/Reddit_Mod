// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.e;
import ak0.m;
import ak0.n;
import mj2.c0;
import o9.c;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class ClassificationBox extends AbstractFullBox
{
    public static final String TYPE = "clsf";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private static final /* synthetic */ a ajc$tjp_5;
    private static final /* synthetic */ a ajc$tjp_6;
    private static final /* synthetic */ a ajc$tjp_7;
    private static final /* synthetic */ a ajc$tjp_8;
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
    
    private static /* synthetic */ void ajc$preClinit() {
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
        this.classificationTableIndex = c0.Y(byteBuffer);
        this.language = c0.U(byteBuffer);
        this.classificationInfo = c0.W(byteBuffer);
    }
    
    public String getClassificationEntity() {
        n.x(b.b(ClassificationBox.ajc$tjp_1, (Object)this, (Object)this));
        return this.classificationEntity;
    }
    
    public String getClassificationInfo() {
        n.x(b.b(ClassificationBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.classificationInfo;
    }
    
    public int getClassificationTableIndex() {
        n.x(b.b(ClassificationBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.classificationTableIndex;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(c.f(this.classificationEntity));
        ah.a.m0(this.classificationTableIndex, byteBuffer);
        ah.a.l0(this.language, byteBuffer);
        m.A(this.classificationInfo, byteBuffer, (byte)0);
    }
    
    public long getContentSize() {
        return at1.a.m2(this.classificationInfo) + 8 + 1;
    }
    
    public String getLanguage() {
        n.x(b.b(ClassificationBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.language;
    }
    
    public void setClassificationEntity(final String classificationEntity) {
        n.x(b.c(ClassificationBox.ajc$tjp_4, (Object)this, (Object)this, (Object)classificationEntity));
        this.classificationEntity = classificationEntity;
    }
    
    public void setClassificationInfo(final String classificationInfo) {
        n.x(b.c(ClassificationBox.ajc$tjp_7, (Object)this, (Object)this, (Object)classificationInfo));
        this.classificationInfo = classificationInfo;
    }
    
    public void setClassificationTableIndex(final int classificationTableIndex) {
        n.x(b.c(ClassificationBox.ajc$tjp_5, (Object)this, (Object)this, (Object)new Integer(classificationTableIndex)));
        this.classificationTableIndex = classificationTableIndex;
    }
    
    public void setLanguage(final String language) {
        n.x(b.c(ClassificationBox.ajc$tjp_6, (Object)this, (Object)this, (Object)language));
        this.language = language;
    }
    
    public String toString() {
        final yt2.c b = yt2.b.b(ClassificationBox.ajc$tjp_8, (Object)this, (Object)this);
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
