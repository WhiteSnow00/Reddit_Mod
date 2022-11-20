// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import mt2.b;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class CompositionShiftLeastGreatestAtom extends AbstractFullBox
{
    public static final String TYPE = "cslg";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private static final a ajc$tjp_9;
    public int compositionOffsetToDisplayOffsetShift;
    public int displayEndTime;
    public int displayStartTime;
    public int greatestDisplayOffset;
    public int leastDisplayOffset;
    
    static {
        ajc$preClinit();
    }
    
    public CompositionShiftLeastGreatestAtom() {
        super("cslg");
    }
    
    private static void ajc$preClinit() {
        final b b = new b("CompositionShiftLeastGreatestAtom.java", (Class)CompositionShiftLeastGreatestAtom.class);
        ajc$tjp_0 = (a)b.f(b.e("getCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 66);
        ajc$tjp_1 = (a)b.f(b.e("setCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "compositionOffsetToDisplayOffsetShift", "", "void"), 70);
        ajc$tjp_2 = (a)b.f(b.e("getLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 74);
        ajc$tjp_3 = (a)b.f(b.e("setLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "leastDisplayOffset", "", "void"), 78);
        ajc$tjp_4 = (a)b.f(b.e("getGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 82);
        ajc$tjp_5 = (a)b.f(b.e("setGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "greatestDisplayOffset", "", "void"), 86);
        ajc$tjp_6 = (a)b.f(b.e("getDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 90);
        ajc$tjp_7 = (a)b.f(b.e("setDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "displayStartTime", "", "void"), 94);
        ajc$tjp_8 = (a)b.f(b.e("getDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 98);
        ajc$tjp_9 = (a)b.f(b.e("setDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "displayEndTime", "", "void"), 102);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.compositionOffsetToDisplayOffsetShift = byteBuffer.getInt();
        this.leastDisplayOffset = byteBuffer.getInt();
        this.greatestDisplayOffset = byteBuffer.getInt();
        this.displayStartTime = byteBuffer.getInt();
        this.displayEndTime = byteBuffer.getInt();
    }
    
    public int getCompositionOffsetToDisplayOffsetShift() {
        m5.a.s(b.b(CompositionShiftLeastGreatestAtom.ajc$tjp_0, (Object)this, (Object)this));
        return this.compositionOffsetToDisplayOffsetShift;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.compositionOffsetToDisplayOffsetShift);
        byteBuffer.putInt(this.leastDisplayOffset);
        byteBuffer.putInt(this.greatestDisplayOffset);
        byteBuffer.putInt(this.displayStartTime);
        byteBuffer.putInt(this.displayEndTime);
    }
    
    public long getContentSize() {
        return 24L;
    }
    
    public int getDisplayEndTime() {
        m5.a.s(b.b(CompositionShiftLeastGreatestAtom.ajc$tjp_8, (Object)this, (Object)this));
        return this.displayEndTime;
    }
    
    public int getDisplayStartTime() {
        m5.a.s(b.b(CompositionShiftLeastGreatestAtom.ajc$tjp_6, (Object)this, (Object)this));
        return this.displayStartTime;
    }
    
    public int getGreatestDisplayOffset() {
        m5.a.s(b.b(CompositionShiftLeastGreatestAtom.ajc$tjp_4, (Object)this, (Object)this));
        return this.greatestDisplayOffset;
    }
    
    public int getLeastDisplayOffset() {
        m5.a.s(b.b(CompositionShiftLeastGreatestAtom.ajc$tjp_2, (Object)this, (Object)this));
        return this.leastDisplayOffset;
    }
    
    public void setCompositionOffsetToDisplayOffsetShift(final int compositionOffsetToDisplayOffsetShift) {
        m5.a.s(b.c(CompositionShiftLeastGreatestAtom.ajc$tjp_1, (Object)this, (Object)this, (Object)new Integer(compositionOffsetToDisplayOffsetShift)));
        this.compositionOffsetToDisplayOffsetShift = compositionOffsetToDisplayOffsetShift;
    }
    
    public void setDisplayEndTime(final int displayEndTime) {
        m5.a.s(b.c(CompositionShiftLeastGreatestAtom.ajc$tjp_9, (Object)this, (Object)this, (Object)new Integer(displayEndTime)));
        this.displayEndTime = displayEndTime;
    }
    
    public void setDisplayStartTime(final int displayStartTime) {
        m5.a.s(b.c(CompositionShiftLeastGreatestAtom.ajc$tjp_7, (Object)this, (Object)this, (Object)new Integer(displayStartTime)));
        this.displayStartTime = displayStartTime;
    }
    
    public void setGreatestDisplayOffset(final int greatestDisplayOffset) {
        m5.a.s(b.c(CompositionShiftLeastGreatestAtom.ajc$tjp_5, (Object)this, (Object)this, (Object)new Integer(greatestDisplayOffset)));
        this.greatestDisplayOffset = greatestDisplayOffset;
    }
    
    public void setLeastDisplayOffset(final int leastDisplayOffset) {
        m5.a.s(b.c(CompositionShiftLeastGreatestAtom.ajc$tjp_3, (Object)this, (Object)this, (Object)new Integer(leastDisplayOffset)));
        this.leastDisplayOffset = leastDisplayOffset;
    }
}
