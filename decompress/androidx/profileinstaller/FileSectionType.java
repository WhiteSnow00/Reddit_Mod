// 
// Decompiled by Procyon v0.6.0
// 

package androidx.profileinstaller;

import a2.b;

enum FileSectionType
{
    AGGREGATION_COUNT(4L), 
    CLASSES(2L), 
    DEX_FILES(0L), 
    EXTRA_DESCRIPTORS(1L), 
    METHODS(3L);
    
    private final long mValue;
    
    private FileSectionType(final long mValue) {
        this.mValue = mValue;
    }
    
    public static FileSectionType fromValue(final long n) {
        final FileSectionType[] values = values();
        for (int i = 0; i < values.length; ++i) {
            if (values[i].getValue() == n) {
                return values[i];
            }
        }
        throw new IllegalArgumentException(b.h("Unsupported FileSection Type ", n));
    }
    
    public long getValue() {
        return this.mValue;
    }
}
