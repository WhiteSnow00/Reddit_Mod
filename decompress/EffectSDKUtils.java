// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import java.io.InputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Iterator;
import android.text.TextUtils;
import java.io.FileFilter;
import java.util.Collection;
import android.content.Context;
import java.io.Closeable;
import X.608;
import X.4F0;
import com.bytedance.ies.abmock.SettingsManager;
import X.609;
import X.NIJ;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashSet;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Set;
import java.util.List;

public class EffectSDKUtils
{
    public static List<String> assetFiles;
    public static Set<File> localFiles;
    public static Set<File> needRemoveFiles;
    
    static {
        Covode.recordClassIndex(2776);
        EffectSDKUtils.localFiles = new HashSet<File>();
        EffectSDKUtils.assetFiles = ModelsList.list;
        EffectSDKUtils.needRemoveFiles = new HashSet<File>();
    }
    
    public static boolean INVOKEVIRTUAL_com_bef_effectsdk_EffectSDKUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(final File file) {
        MethodCollector.i(8080);
        while (true) {
            try {
                609 liz;
                if (NIJ.LIZIZ()) {
                    liz = (609)SettingsManager.LIZ().LIZ("storage_intercepter_key", (Class)609.class, (Object)4F0.LIZ);
                }
                else {
                    liz = 4F0.LIZ;
                }
                if (608.LIZ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_delete_log", 608.LIZ(liz));
                }
                if (608.LIZJ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_handle", 608.LIZ(liz));
                    MethodCollector.o(8080);
                    return false;
                }
                final boolean delete = file.delete();
                MethodCollector.o(8080);
                return delete;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void closeQuietly(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0017;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {
            goto Label_0017;
        }
    }
    
    public static void copyAssets(final Context context, String fileName, final String[] array, final boolean b) {
        if (!EffectSDKUtils.needRemoveFiles.isEmpty()) {
            EffectSDKUtils.needRemoveFiles.clear();
        }
        EffectSDKUtils.needRemoveFiles.addAll(EffectSDKUtils.localFiles);
        String string = fileName;
        if (!fileName.endsWith("/")) {
            final StringBuilder sb = new StringBuilder();
            sb.append(fileName);
            sb.append("/");
            string = sb.toString();
        }
    Label_0084:
        for (final String s : EffectSDKUtils.assetFiles) {
            fileName = getFileName(s);
            final File takeFirstMatchingOrNull = takeFirstMatchingOrNull(EffectSDKUtils.needRemoveFiles, new FileFilter() {
                static {
                    Covode.recordClassIndex(2778);
                }
                
                @Override
                public final boolean accept(final File file) {
                    return file.getName().contains(fileName);
                }
            });
            if (takeFirstMatchingOrNull != null && new File(string, getAssetRelativePath(s)).exists()) {
                EffectSDKUtils.needRemoveFiles.remove(takeFirstMatchingOrNull);
            }
            else {
                if (array != null && !TextUtils.isEmpty((CharSequence)fileName)) {
                    final int length = array.length;
                    int i = 0;
                    while (i < length) {
                        if (fileName.equals(array[i])) {
                            if (b) {
                                copyFile(context, s, string);
                                continue Label_0084;
                            }
                            continue Label_0084;
                        }
                        else {
                            ++i;
                        }
                    }
                }
                if (b) {
                    continue;
                }
                copyFile(context, s, string);
            }
        }
    }
    
    public static void copyFile(Context open, final String s, final String s2) {
        MethodCollector.i(8069);
        Object string = null;
        Label_0259: {
            FileOutputStream fileOutputStream;
            try {
                open = (Context)open.getAssets().open(s);
                try {
                    string = new StringBuilder();
                    ((StringBuilder)string).append(s2);
                    ((StringBuilder)string).append(s.substring(s.indexOf("model") + 6, s.lastIndexOf("/")));
                    string = ((StringBuilder)string).toString();
                    final File file = new File((String)string);
                    if (file.exists() || file.mkdirs()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append((String)string);
                        sb.append("/");
                        sb.append(getFileName(s));
                        string = new FileOutputStream(new File(sb.toString()));
                        try {
                            final byte[] array = new byte[1024];
                            while (true) {
                                final int read = ((InputStream)open).read(array);
                                if (read <= 0) {
                                    break;
                                }
                                ((FileOutputStream)string).write(array, 0, read);
                            }
                            try {
                                closeQuietly((Closeable)open);
                                return;
                            }
                            finally {
                                closeQuietly((Closeable)string);
                                MethodCollector.o(8069);
                            }
                        }
                        finally {
                            open = (Context)string;
                            break Label_0259;
                        }
                    }
                    string = new(java.io.IOException.class)();
                    final StringBuilder sb2 = new StringBuilder("Can not mkdirs ");
                    sb2.append(file.getPath());
                    new IOException(sb2.toString());
                    MethodCollector.o(8069);
                    throw string;
                }
                finally {
                    string = null;
                }
            }
            finally {
                open = null;
                fileOutputStream = (FileOutputStream)string;
            }
            try {
                closeQuietly(fileOutputStream);
                closeQuietly((Closeable)open);
                MethodCollector.o(8069);
                throw;
            }
            finally {
                closeQuietly((Closeable)open);
                MethodCollector.o(8069);
            }
        }
    }
    
    public static void deleteNoUseModel() {
        for (final File file : EffectSDKUtils.localFiles) {
            if (EffectSDKUtils.needRemoveFiles.contains(file) && file.exists()) {
                INVOKEVIRTUAL_com_bef_effectsdk_EffectSDKUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
            }
        }
    }
    
    public static void flushAlgorithmModelFiles(final Context context, final String s) {
        if (!EffectSDKUtils.localFiles.isEmpty()) {
            EffectSDKUtils.localFiles.clear();
        }
        scanRecursive(s, EffectSDKUtils.localFiles);
        copyAssets(context, s, null, false);
        deleteNoUseModel();
        EffectSDKUtils.localFiles.clear();
    }
    
    public static void flushAlgorithmModelFiles(final Context context, final String s, final String[] array, final boolean b) {
        if (!EffectSDKUtils.localFiles.isEmpty()) {
            EffectSDKUtils.localFiles.clear();
        }
        scanRecursive(s, EffectSDKUtils.localFiles);
        copyAssets(context, s, array, b);
        deleteNoUseModel();
        EffectSDKUtils.localFiles.clear();
    }
    
    public static String getAssetRelativePath(final String s) {
        final int index = s.indexOf("model/");
        String substring = s;
        if (index >= 0) {
            substring = s.substring(index + 6, s.length());
        }
        return substring;
    }
    
    public static String getFileName(final String s) {
        final int lastIndex = s.lastIndexOf("/");
        if (lastIndex != -1) {
            return s.substring(lastIndex + 1, s.length());
        }
        return "";
    }
    
    public static String getSdkVersion() {
        MethodCollector.i(8082);
        final String nativeGetSdkVersion = nativeGetSdkVersion();
        MethodCollector.o(8082);
        return nativeGetSdkVersion;
    }
    
    public static native String nativeGetSdkVersion();
    
    public static boolean needUpdate(final Context context, final String s) {
        if (!EffectSDKUtils.localFiles.isEmpty()) {
            EffectSDKUtils.localFiles.clear();
        }
        scanRecursive(s, EffectSDKUtils.localFiles);
        try {
            if (EffectSDKUtils.assetFiles.size() > EffectSDKUtils.localFiles.size()) {}
            final Iterator<String> iterator = EffectSDKUtils.assetFiles.iterator();
            while (iterator.hasNext() && takeFirstMatchingOrNull(EffectSDKUtils.localFiles, new FileFilter() {
                public final /* synthetic */ String val$file = iterator.next();
                
                static {
                    Covode.recordClassIndex(2777);
                }
                
                @Override
                public final boolean accept(final File file) {
                    MethodCollector.i(5007);
                    final boolean contains = this.val$file.contains(file.getName());
                    boolean b = false;
                    if (contains) {
                        Closeable open = null;
                        try {
                            final InputStream inputStream = (InputStream)(open = context.getAssets().open(this.val$file));
                            final int available = inputStream.available();
                            open = inputStream;
                            if (file.length() == available) {
                                b = true;
                            }
                            return b;
                        }
                        catch (final IOException ex) {
                            return false;
                        }
                        finally {
                            EffectSDKUtils.closeQuietly(open);
                            MethodCollector.o(5007);
                        }
                    }
                    MethodCollector.o(5007);
                    return false;
                }
            }) != null) {}
            return false;
        }
        finally {
            return true;
        }
    }
    
    public static void scanRecursive(final String s, final Set<File> set) {
        final File file = new File(s);
        if (!file.exists()) {
            return;
        }
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (final File file2 : listFiles) {
                if (file2.isDirectory()) {
                    scanRecursive(file2.getAbsolutePath(), set);
                }
                else {
                    set.add(file2);
                }
            }
        }
    }
    
    public static File takeFirstMatchingOrNull(final Set<File> set, final FileFilter fileFilter) {
        for (final File file : set) {
            if (fileFilter.accept(file)) {
                return file;
            }
        }
        return null;
    }
}
