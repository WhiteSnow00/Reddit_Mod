// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.io.IOException;
import java.util.zip.InflaterOutputStream;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.protocol.module.Console;
import java.io.OutputStream;
import java.io.InputStream;

public class DecompressionHelper
{
    public static final String DEFLATE_ENCODING = "deflate";
    public static final String GZIP_ENCODING = "gzip";
    
    public static InputStream teeInputWithDecompression(final NetworkPeerManager networkPeerManager, final String s, final InputStream inputStream, OutputStream create, final String s2, final ResponseHandler responseHandler) throws IOException {
        if (s2 != null) {
            final boolean equals = "gzip".equals(s2);
            final boolean equals2 = "deflate".equals(s2);
            if (!equals && !equals2) {
                final Console.MessageLevel warning = Console.MessageLevel.WARNING;
                final Console.MessageSource network = Console.MessageSource.NETWORK;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported Content-Encoding in response for request #");
                sb.append(s);
                sb.append(": ");
                sb.append(s2);
                CLog.writeToConsole(networkPeerManager, warning, network, sb.toString());
            }
            else {
                final CountingOutputStream countingOutputStream = new CountingOutputStream(create);
                if (equals) {
                    create = GunzippingOutputStream.create(countingOutputStream);
                    final CountingOutputStream countingOutputStream2 = countingOutputStream;
                    return new ResponseHandlingInputStream(inputStream, s, create, countingOutputStream2, networkPeerManager, responseHandler);
                }
                CountingOutputStream countingOutputStream2 = countingOutputStream;
                if (equals2) {
                    create = new InflaterOutputStream(countingOutputStream);
                    countingOutputStream2 = countingOutputStream;
                    return new ResponseHandlingInputStream(inputStream, s, create, countingOutputStream2, networkPeerManager, responseHandler);
                }
                return new ResponseHandlingInputStream(inputStream, s, create, countingOutputStream2, networkPeerManager, responseHandler);
            }
        }
        CountingOutputStream countingOutputStream2 = null;
        return new ResponseHandlingInputStream(inputStream, s, create, countingOutputStream2, networkPeerManager, responseHandler);
    }
}
