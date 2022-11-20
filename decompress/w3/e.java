// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import android.os.CancellationSignal;
import android.content.ContentResolver;
import android.net.Uri;
import android.database.Cursor;
import android.content.pm.Signature;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ContentUris;
import android.net.Uri$Builder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.content.Context;

public final class e
{
    public static final d a;
    
    static {
        a = new d(0);
    }
    
    public static l a(final Context context, final f f) throws PackageManager$NameNotFoundException {
        final PackageManager packageManager = context.getPackageManager();
        final Resources resources = context.getResources();
        final String a = f.a;
        final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(f.b)) {
                final Signature[] signatures = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                final ArrayList list = new ArrayList();
                for (int length = signatures.length, i = 0; i < length; ++i) {
                    list.add(signatures[i].toByteArray());
                }
                Collections.sort((List<Object>)list, e.a);
                List<List<byte[]>> list2 = f.d;
                if (list2 == null) {
                    list2 = p3.d.b(resources, f.e);
                }
                int n = 0;
                Cursor cursor;
                ProviderInfo providerInfo;
                while (true) {
                    final int size = list2.size();
                    cursor = null;
                    if (n >= size) {
                        providerInfo = null;
                        break;
                    }
                    final ArrayList list3 = new ArrayList<Object>(list2.get(n));
                    Collections.sort((List<E>)list3, e.a);
                    boolean b = false;
                    Label_0247: {
                        Label_0234: {
                            if (list.size() == list3.size()) {
                                for (int j = 0; j < list.size(); ++j) {
                                    if (!Arrays.equals((byte[])list.get(j), (byte[])list3.get(j))) {
                                        break Label_0234;
                                    }
                                }
                                b = true;
                                break Label_0247;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        providerInfo = resolveContentProvider;
                        break;
                    }
                    ++n;
                }
                if (providerInfo == null) {
                    return new l(1, null);
                }
                final String authority = providerInfo.authority;
                final ArrayList list4 = new ArrayList();
                final Uri build = new Uri$Builder().scheme("content").authority(authority).build();
                final Uri build2 = new Uri$Builder().scheme("content").authority(authority).appendPath("file").build();
                Cursor cursor2 = cursor;
                try {
                    final ContentResolver contentResolver = context.getContentResolver();
                    cursor2 = cursor;
                    final String c = f.c;
                    cursor2 = cursor;
                    final Cursor a2 = e.a.a(contentResolver, build, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { c }, null, null);
                    ArrayList<m> list5 = list4;
                    if (a2 != null) {
                        list5 = list4;
                        cursor2 = a2;
                        if (a2.getCount() > 0) {
                            cursor2 = a2;
                            final int columnIndex = a2.getColumnIndex("result_code");
                            cursor2 = a2;
                            cursor2 = a2;
                            final ArrayList<m> list6 = new ArrayList<m>();
                            cursor2 = a2;
                            final int columnIndex2 = a2.getColumnIndex("_id");
                            cursor2 = a2;
                            final int columnIndex3 = a2.getColumnIndex("file_id");
                            cursor2 = a2;
                            final int columnIndex4 = a2.getColumnIndex("font_ttc_index");
                            cursor2 = a2;
                            final int columnIndex5 = a2.getColumnIndex("font_weight");
                            cursor2 = a2;
                            final int columnIndex6 = a2.getColumnIndex("font_italic");
                            while (true) {
                                list5 = list6;
                                cursor2 = a2;
                                if (!a2.moveToNext()) {
                                    break;
                                }
                                int int1;
                                if (columnIndex != -1) {
                                    cursor2 = a2;
                                    int1 = a2.getInt(columnIndex);
                                }
                                else {
                                    int1 = 0;
                                }
                                int int2;
                                if (columnIndex4 != -1) {
                                    cursor2 = a2;
                                    int2 = a2.getInt(columnIndex4);
                                }
                                else {
                                    int2 = 0;
                                }
                                Uri uri;
                                if (columnIndex3 == -1) {
                                    cursor2 = a2;
                                    uri = ContentUris.withAppendedId(build, a2.getLong(columnIndex2));
                                }
                                else {
                                    cursor2 = a2;
                                    uri = ContentUris.withAppendedId(build2, a2.getLong(columnIndex3));
                                }
                                int int3;
                                if (columnIndex5 != -1) {
                                    cursor2 = a2;
                                    int3 = a2.getInt(columnIndex5);
                                }
                                else {
                                    int3 = 400;
                                }
                                boolean b2 = false;
                                Label_0706: {
                                    if (columnIndex6 != -1) {
                                        cursor2 = a2;
                                        if (a2.getInt(columnIndex6) == 1) {
                                            b2 = true;
                                            break Label_0706;
                                        }
                                    }
                                    b2 = false;
                                }
                                cursor2 = a2;
                                cursor2 = a2;
                                final m m = new m(uri, int2, int3, b2, int1);
                                cursor2 = a2;
                                list6.add(m);
                            }
                        }
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    return new l(0, list5.toArray(new m[0]));
                }
                finally {
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                }
            }
            final StringBuilder r = d.r("Found content provider ", a, ", but package was not ");
            r.append(f.b);
            throw new PackageManager$NameNotFoundException(r.toString());
        }
        throw new PackageManager$NameNotFoundException(b.l("No package found for authority: ", a));
    }
    
    public static final class a
    {
        public static Cursor a(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, final Object o) {
            return contentResolver.query(uri, array, s, array2, s2, (CancellationSignal)o);
        }
    }
}
