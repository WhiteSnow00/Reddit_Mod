// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public interface AsyncPrettyPrinter
{
    PrettyPrinterDisplayType getPrettifiedType();
    
    void printTo(final PrintWriter p0, final InputStream p1) throws IOException;
}
