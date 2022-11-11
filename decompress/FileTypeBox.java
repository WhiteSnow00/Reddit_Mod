// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import a81.e;
import java.util.Iterator;
import n9.c;
import java.util.LinkedList;
import ej2.c0;
import java.nio.ByteBuffer;
import pt2.b;
import java.util.Collections;
import java.util.List;
import ot2.a;
import com.googlecode.mp4parser.AbstractBox;

public class FileTypeBox extends AbstractBox
{
    public static final String TYPE = "ftyp";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private static final /* synthetic */ a ajc$tjp_5;
    private List<String> compatibleBrands;
    private String majorBrand;
    private long minorVersion;
    
    static {
        ajc$preClinit();
    }
    
    public FileTypeBox() {
        super("ftyp");
        this.compatibleBrands = Collections.emptyList();
    }
    
    public FileTypeBox(final String majorBrand, final long minorVersion, final List<String> compatibleBrands) {
        super("ftyp");
        Collections.emptyList();
        this.majorBrand = majorBrand;
        this.minorVersion = minorVersion;
        this.compatibleBrands = compatibleBrands;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("FileTypeBox.java", (Class)FileTypeBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        ajc$tjp_1 = (a)b.f(b.e("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        ajc$tjp_2 = (a)b.f(b.e("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "", "void"), 103);
        ajc$tjp_3 = (a)b.f(b.e("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "long"), 113);
        ajc$tjp_4 = (a)b.f(b.e("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), 122);
        ajc$tjp_5 = (a)b.f(b.e("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.majorBrand = c0.Q3(byteBuffer);
        this.minorVersion = c0.a4(byteBuffer);
        final int n = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList<String>();
        for (int i = 0; i < n; ++i) {
            this.compatibleBrands.add(c0.Q3(byteBuffer));
        }
    }
    
    public List<String> getCompatibleBrands() {
        b.q(b.b(FileTypeBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.compatibleBrands;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(c.c(this.majorBrand));
        byteBuffer.putInt((int)this.minorVersion);
        final Iterator<String> iterator = this.compatibleBrands.iterator();
        while (iterator.hasNext()) {
            byteBuffer.put(c.c((String)iterator.next()));
        }
    }
    
    public long getContentSize() {
        return this.compatibleBrands.size() * 4 + 8;
    }
    
    public String getMajorBrand() {
        b.q(b.b(FileTypeBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.majorBrand;
    }
    
    public long getMinorVersion() {
        b.q(b.b(FileTypeBox.ajc$tjp_3, (Object)this, (Object)this));
        return this.minorVersion;
    }
    
    public void setCompatibleBrands(final List<String> compatibleBrands) {
        b.q(b.c(FileTypeBox.ajc$tjp_5, (Object)this, (Object)this, (Object)compatibleBrands));
        this.compatibleBrands = compatibleBrands;
    }
    
    public void setMajorBrand(final String majorBrand) {
        b.q(b.c(FileTypeBox.ajc$tjp_1, (Object)this, (Object)this, (Object)majorBrand));
        this.majorBrand = majorBrand;
    }
    
    public void setMinorVersion(final long minorVersion) {
        b.q(b.c(FileTypeBox.ajc$tjp_2, (Object)this, (Object)this, (Object)new Long(minorVersion)));
        this.minorVersion = minorVersion;
    }
    
    public String toString() {
        final StringBuilder q = d.q("FileTypeBox[", "majorBrand=");
        q.append(this.getMajorBrand());
        q.append(";");
        q.append("minorVersion=");
        q.append(this.getMinorVersion());
        final Iterator<String> iterator = this.compatibleBrands.iterator();
        while (iterator.hasNext()) {
            e.A(q, ";", "compatibleBrand=", (String)iterator.next());
        }
        q.append("]");
        return q.toString();
    }
}
