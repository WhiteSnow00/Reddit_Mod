// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import ak0.n;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class RecordingYearBox extends AbstractFullBox
{
    public static final String TYPE = "yrrc";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    public int recordingYear;
    
    static {
        ajc$preClinit();
    }
    
    public RecordingYearBox() {
        super("yrrc");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final b b = new b("RecordingYearBox.java", (Class)RecordingYearBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "", "", "", "int"), 42);
        ajc$tjp_1 = (a)b.f(b.e("setRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "int", "recordingYear", "", "void"), 46);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.recordingYear = c0.Y(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        ah.a.m0(this.recordingYear, byteBuffer);
    }
    
    public long getContentSize() {
        return 6L;
    }
    
    public int getRecordingYear() {
        n.x(b.b(RecordingYearBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.recordingYear;
    }
    
    public void setRecordingYear(final int recordingYear) {
        n.x(b.c(RecordingYearBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Integer(recordingYear)));
        this.recordingYear = recordingYear;
    }
}
