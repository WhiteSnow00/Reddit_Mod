// 
// Decompiled by Procyon v0.6.0
// 

package aa;

import java.io.File;
import java.io.FilenameFilter;

public final class d implements FilenameFilter
{
    public final /* synthetic */ String a;
    
    public d(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean accept(final File file, final String s) {
        return s.startsWith(this.a);
    }
}
