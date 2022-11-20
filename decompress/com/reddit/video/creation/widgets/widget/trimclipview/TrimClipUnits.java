// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import b5.k;
import zd.b;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits;", "", "Milliseconds", "Percentage", "Pixels", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface TrimClipUnits
{
    @Metadata(d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\rH\u00d6\u0001J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001d" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "", "value", "", "(J)V", "getValue", "()J", "coerceAtMost", "maximumValue", "coerceIn", "range", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;", "compareTo", "", "other", "component1", "copy", "div", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Percentage;", "equals", "", "hashCode", "minus", "plus", "rangeTo", "toString", "", "Companion", "Range", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Milliseconds
    {
        public static final Companion Companion;
        private static final Milliseconds ONE;
        private static final Milliseconds ZERO;
        private final long value;
        
        static {
            Companion = new Companion(null);
            ZERO = new Milliseconds(0L);
            ONE = new Milliseconds(1L);
        }
        
        public Milliseconds(final long value) {
            this.value = value;
        }
        
        public static final Milliseconds access$getONE$cp() {
            return Milliseconds.ONE;
        }
        
        public static final Milliseconds access$getZERO$cp() {
            return Milliseconds.ZERO;
        }
        
        public static Milliseconds copy$default(final Milliseconds milliseconds, long value, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                value = milliseconds.value;
            }
            return milliseconds.copy(value);
        }
        
        public final Milliseconds coerceAtMost(final Milliseconds milliseconds) {
            e.f((Object)milliseconds, "maximumValue");
            final long value = this.value;
            final long value2 = milliseconds.value;
            long n = value;
            if (value > value2) {
                n = value2;
            }
            return new Milliseconds(n);
        }
        
        public final Milliseconds coerceIn(final Range range) {
            e.f((Object)range, "range");
            return new Milliseconds(b.z(this.value, range.getMin().value, range.getMax().value));
        }
        
        public final int compareTo(final Milliseconds milliseconds) {
            e.f((Object)milliseconds, "other");
            final long n = lcmp(this.value, milliseconds.value);
            int n2;
            if (n < 0) {
                n2 = -1;
            }
            else if (n == 0) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            return n2;
        }
        
        public final long component1() {
            return this.value;
        }
        
        public final Milliseconds copy(final long n) {
            return new Milliseconds(n);
        }
        
        public final Percentage div(final Milliseconds milliseconds) {
            e.f((Object)milliseconds, "other");
            return new Percentage(this.value / (float)milliseconds.value);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Milliseconds && this.value == ((Milliseconds)o).value);
        }
        
        public final long getValue() {
            return this.value;
        }
        
        @Override
        public int hashCode() {
            return Long.hashCode(this.value);
        }
        
        public final Milliseconds minus(final Milliseconds milliseconds) {
            e.f((Object)milliseconds, "other");
            return new Milliseconds(this.value - milliseconds.value);
        }
        
        public final Milliseconds plus(final Milliseconds milliseconds) {
            e.f((Object)milliseconds, "other");
            return new Milliseconds(this.value + milliseconds.value);
        }
        
        public final Range rangeTo(final Milliseconds milliseconds) {
            e.f((Object)milliseconds, "other");
            return new Range(this, milliseconds);
        }
        
        @Override
        public String toString() {
            return k.k(a.t("Milliseconds(value="), this.value, ')');
        }
        
        @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Companion;", "", "()V", "ONE", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "getONE", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "ZERO", "getZERO", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class Companion
        {
            private Companion() {
            }
            
            public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
            
            public final Milliseconds getONE() {
                return Milliseconds.access$getONE$cp();
            }
            
            public final Milliseconds getZERO() {
                return Milliseconds.access$getZERO$cp();
            }
        }
        
        @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0086\u0002J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\u0011\u001a\u00020\u0000J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds$Range;", "", "min", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "max", "(Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;)V", "getMax", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "getMin", "component1", "component2", "contains", "", "milliseconds", "copy", "equals", "other", "exclusive", "hashCode", "", "toString", "", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class Range
        {
            private final Milliseconds max;
            private final Milliseconds min;
            
            public Range(final Milliseconds min, final Milliseconds max) {
                e.f((Object)min, "min");
                e.f((Object)max, "max");
                this.min = min;
                this.max = max;
            }
            
            public static Range copy$default(final Range range, Milliseconds min, Milliseconds max, final int n, final Object o) {
                if ((n & 0x1) != 0x0) {
                    min = range.min;
                }
                if ((n & 0x2) != 0x0) {
                    max = range.max;
                }
                return range.copy(min, max);
            }
            
            public final Milliseconds component1() {
                return this.min;
            }
            
            public final Milliseconds component2() {
                return this.max;
            }
            
            public final boolean contains(final Milliseconds milliseconds) {
                e.f((Object)milliseconds, "milliseconds");
                final long value = this.min.getValue();
                final long value2 = this.max.getValue();
                final long value3 = milliseconds.getValue();
                boolean b = false;
                if (value <= value3) {
                    b = b;
                    if (value3 <= value2) {
                        b = true;
                    }
                }
                return b;
            }
            
            public final Range copy(final Milliseconds milliseconds, final Milliseconds milliseconds2) {
                e.f((Object)milliseconds, "min");
                e.f((Object)milliseconds2, "max");
                return new Range(milliseconds, milliseconds2);
            }
            
            @Override
            public boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof Range)) {
                    return false;
                }
                final Range range = (Range)o;
                return e.a((Object)this.min, (Object)range.min) && e.a((Object)this.max, (Object)range.max);
            }
            
            public final Range exclusive() {
                final Milliseconds min = this.min;
                final Companion companion = Milliseconds.Companion;
                return min.plus(companion.getONE()).rangeTo(this.max.minus(companion.getONE()));
            }
            
            public final Milliseconds getMax() {
                return this.max;
            }
            
            public final Milliseconds getMin() {
                return this.min;
            }
            
            @Override
            public int hashCode() {
                return this.max.hashCode() + this.min.hashCode() * 31;
            }
            
            @Override
            public String toString() {
                final StringBuilder t = a.t("Range(min=");
                t.append(this.min);
                t.append(", max=");
                t.append(this.max);
                t.append(')');
                return t.toString();
            }
        }
    }
    
    @Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0011\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u000bH\u00d6\u0001J\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0012H\u0086\u0002J\u0011\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0013H\u0086\u0002J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Percentage;", "", "value", "", "(F)V", "getValue", "()F", "component1", "copy", "div", "divisor", "", "equals", "", "other", "hashCode", "minus", "times", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "toString", "", "Companion", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Percentage
    {
        public static final Companion Companion;
        private static final Percentage ONE;
        private static final Percentage ZERO;
        private final float value;
        
        static {
            Companion = new Companion(null);
            ZERO = new Percentage(0.0f);
            ONE = new Percentage(1.0f);
        }
        
        public Percentage(final float value) {
            this.value = value;
        }
        
        public static final Percentage access$getONE$cp() {
            return Percentage.ONE;
        }
        
        public static final Percentage access$getZERO$cp() {
            return Percentage.ZERO;
        }
        
        public static Percentage copy$default(final Percentage percentage, float value, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                value = percentage.value;
            }
            return percentage.copy(value);
        }
        
        public final float component1() {
            return this.value;
        }
        
        public final Percentage copy(final float n) {
            return new Percentage(n);
        }
        
        public final Percentage div(final int n) {
            return new Percentage(this.value / n);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Percentage && e.a((Object)this.value, (Object)((Percentage)o).value));
        }
        
        public final float getValue() {
            return this.value;
        }
        
        @Override
        public int hashCode() {
            return Float.hashCode(this.value);
        }
        
        public final Percentage minus(final Percentage percentage) {
            e.f((Object)percentage, "other");
            return new Percentage(this.value - percentage.value);
        }
        
        public final Milliseconds times(final Milliseconds milliseconds) {
            e.f((Object)milliseconds, "other");
            return new Milliseconds(p7.a.X(this.value * milliseconds.getValue()));
        }
        
        public final Pixels times(final Pixels pixels) {
            e.f((Object)pixels, "other");
            return new Pixels(p7.a.W(this.value * pixels.getValue()));
        }
        
        @Override
        public String toString() {
            return aq2.a.n(a.t("Percentage(value="), this.value, ')');
        }
        
        @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Percentage$Companion;", "", "()V", "ONE", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Percentage;", "getONE", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Percentage;", "ZERO", "getZERO", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class Companion
        {
            private Companion() {
            }
            
            public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
            
            public final Percentage getONE() {
                return Percentage.access$getONE$cp();
            }
            
            public final Percentage getZERO() {
                return Percentage.access$getZERO$cp();
            }
        }
    }
    
    @Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "", "value", "", "(I)V", "getValue", "()I", "coerceIn", "range", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels$Range;", "component1", "copy", "div", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Percentage;", "other", "equals", "", "hashCode", "minus", "plus", "rangeTo", "toString", "", "Companion", "Range", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Pixels
    {
        public static final Companion Companion;
        private static final Pixels ONE;
        private static final Pixels ZERO;
        private final int value;
        
        static {
            Companion = new Companion(null);
            ZERO = new Pixels(0);
            ONE = new Pixels(1);
        }
        
        public Pixels(final int value) {
            this.value = value;
        }
        
        public static final Pixels access$getONE$cp() {
            return Pixels.ONE;
        }
        
        public static final Pixels access$getZERO$cp() {
            return Pixels.ZERO;
        }
        
        public static Pixels copy$default(final Pixels pixels, int value, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                value = pixels.value;
            }
            return pixels.copy(value);
        }
        
        public final Pixels coerceIn(final Range range) {
            e.f((Object)range, "range");
            return new Pixels(b.x(this.value, range.getMin().value, range.getMax().value));
        }
        
        public final int component1() {
            return this.value;
        }
        
        public final Pixels copy(final int n) {
            return new Pixels(n);
        }
        
        public final Percentage div(final Pixels pixels) {
            e.f((Object)pixels, "other");
            return new Percentage(this.value / (float)pixels.value);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Pixels && this.value == ((Pixels)o).value);
        }
        
        public final int getValue() {
            return this.value;
        }
        
        @Override
        public int hashCode() {
            return Integer.hashCode(this.value);
        }
        
        public final Pixels minus(final Pixels pixels) {
            e.f((Object)pixels, "other");
            return new Pixels(this.value - pixels.value);
        }
        
        public final Pixels plus(final Pixels pixels) {
            e.f((Object)pixels, "other");
            return new Pixels(this.value + pixels.value);
        }
        
        public final Range rangeTo(final Pixels pixels) {
            e.f((Object)pixels, "other");
            return new Range(this, pixels);
        }
        
        @Override
        public String toString() {
            return d.j(a.t("Pixels(value="), this.value, ')');
        }
        
        @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels$Companion;", "", "()V", "ONE", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "getONE", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "ZERO", "getZERO", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class Companion
        {
            private Companion() {
            }
            
            public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
            
            public final Pixels getONE() {
                return Pixels.access$getONE$cp();
            }
            
            public final Pixels getZERO() {
                return Pixels.access$getZERO$cp();
            }
        }
        
        @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0086\u0002J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels$Range;", "", "min", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "max", "(Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;)V", "getMax", "()Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "getMin", "component1", "component2", "contains", "", "pixels", "copy", "equals", "other", "hashCode", "", "toString", "", "widgets_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class Range
        {
            private final Pixels max;
            private final Pixels min;
            
            public Range(final Pixels min, final Pixels max) {
                e.f((Object)min, "min");
                e.f((Object)max, "max");
                this.min = min;
                this.max = max;
            }
            
            public static Range copy$default(final Range range, Pixels min, Pixels max, final int n, final Object o) {
                if ((n & 0x1) != 0x0) {
                    min = range.min;
                }
                if ((n & 0x2) != 0x0) {
                    max = range.max;
                }
                return range.copy(min, max);
            }
            
            public final Pixels component1() {
                return this.min;
            }
            
            public final Pixels component2() {
                return this.max;
            }
            
            public final boolean contains(final Pixels pixels) {
                e.f((Object)pixels, "pixels");
                final int value = this.min.getValue();
                final int value2 = this.max.getValue();
                final int value3 = pixels.getValue();
                boolean b = false;
                if (value <= value3) {
                    b = b;
                    if (value3 <= value2) {
                        b = true;
                    }
                }
                return b;
            }
            
            public final Range copy(final Pixels pixels, final Pixels pixels2) {
                e.f((Object)pixels, "min");
                e.f((Object)pixels2, "max");
                return new Range(pixels, pixels2);
            }
            
            @Override
            public boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof Range)) {
                    return false;
                }
                final Range range = (Range)o;
                return e.a((Object)this.min, (Object)range.min) && e.a((Object)this.max, (Object)range.max);
            }
            
            public final Pixels getMax() {
                return this.max;
            }
            
            public final Pixels getMin() {
                return this.min;
            }
            
            @Override
            public int hashCode() {
                return this.max.hashCode() + this.min.hashCode() * 31;
            }
            
            @Override
            public String toString() {
                final StringBuilder t = a.t("Range(min=");
                t.append(this.min);
                t.append(", max=");
                t.append(this.max);
                t.append(')');
                return t.toString();
            }
        }
    }
}
