// 
// Decompiled by Procyon v0.6.0
// 

package com.benchmark.network;

import X.1CP;
import X.0My;
import java.io.InputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import X.0NA;

public class BXNetWorkController
{
    public static 0NA mNetWorker;
    
    static {
        Covode.recordClassIndex(2973);
    }
    
    public static boolean downloadFile(final String s, final String s2, final String s3) {
        final 0NA mNetWorker = BXNetWorkController.mNetWorker;
        return mNetWorker != null && mNetWorker.LIZ(s, s2, s3);
    }
    
    public static ByteBenchResponse execute(final ByteBenchRequest byteBenchRequest) {
        MethodCollector.i(13508);
        final ByteBenchResponse byteBenchResponse = new ByteBenchResponse();
        final 0NA mNetWorker = BXNetWorkController.mNetWorker;
        Label_0134: {
            if (mNetWorker != null) {
                try {
                    final InputStream liz = mNetWorker.LIZ(byteBenchRequest);
                    byteBenchResponse.mHttpCode = byteBenchRequest.mCode;
                    byteBenchResponse.mMessage = byteBenchRequest.mMessage;
                    if (liz == null) {
                        byteBenchResponse.mErrorCode = -1;
                        MethodCollector.o(13508);
                        return byteBenchResponse;
                    }
                    final byte[] array = new byte[4096];
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        final int read = liz.read(array, 0, 4096);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(array, 0, read);
                    }
                    byteBenchResponse.mData = byteArrayOutputStream.toString();
                    byteBenchResponse.mErrorCode = 0;
                    break Label_0134;
                }
                catch (final IOException ex) {
                    byteBenchResponse.mMessage = ex.getMessage();
                }
            }
            byteBenchResponse.mErrorCode = -1;
        }
        MethodCollector.o(13508);
        return byteBenchResponse;
    }
    
    public static String getNetworkClassify() {
        return 0My.LIZ();
    }
    
    public static void init() {
        BXNetWorkController.mNetWorker = new 1CP();
    }
}
