// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class RecordingYearBox extends AbstractFullBox
{
    public static final String TYPE = "yrrc";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    public int recordingYear;
    
    static {
        ajc$preClinit();
    }
    
    public RecordingYearBox() {
        super("yrrc");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("RecordingYearBox.java", (Class)RecordingYearBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "", "", "", "int"), 42);
        ajc$tjp_1 = (a)b.f(b.e("setRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "int", "recordingYear", "", "void"), 46);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.recordingYear = xd.a.S0(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if0.a.m0(this.recordingYear, byteBuffer);
    }
    
    public long getContentSize() {
        return 6L;
    }
    
    public int getRecordingYear() {
        m5.a.s(b.b(RecordingYearBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.recordingYear;
    }
    
    public void setRecordingYear(final int recordingYear) {
        m5.a.s(b.c(RecordingYearBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Integer(recordingYear)));
        this.recordingYear = recordingYear;
    }
}
