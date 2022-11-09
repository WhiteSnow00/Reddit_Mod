// 
// Decompiled by Procyon v0.6.0
// 

package com.getkeepsafe.relinker;

import java.util.Arrays;

public class MissingLibraryException extends RuntimeException
{
    public MissingLibraryException(final String s, final String[] array, final String[] array2) {
        final StringBuilder l = b.l("Could not find '", s, "'. Looked for: ");
        l.append(Arrays.toString(array));
        l.append(", but only found: ");
        super(a2.b.j(l, Arrays.toString(array2), "."));
    }
}
