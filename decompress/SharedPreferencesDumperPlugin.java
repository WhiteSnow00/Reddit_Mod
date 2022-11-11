// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.dumpapp.plugins;

import com.facebook.stetho.dumpapp.DumperContext;
import java.util.Set;
import java.util.HashSet;
import android.text.TextUtils;
import java.io.File;
import java.util.Map;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import com.facebook.stetho.dumpapp.DumpUsageException;
import a2.b;
import java.util.List;
import java.io.PrintStream;
import android.content.Context;
import com.facebook.stetho.dumpapp.DumperPlugin;

public class SharedPreferencesDumperPlugin implements DumperPlugin
{
    private static final String NAME = "prefs";
    private static final String XML_SUFFIX = ".xml";
    private final Context mAppContext;
    
    public SharedPreferencesDumperPlugin(final Context context) {
        this.mAppContext = context.getApplicationContext();
    }
    
    private void doPrint(final PrintStream printStream, final List<String> list) {
        final String j = b.j(new StringBuilder(), this.mAppContext.getApplicationInfo().dataDir, "/shared_prefs");
        String s;
        if (list.isEmpty()) {
            s = "";
        }
        else {
            s = list.get(0);
        }
        String s2;
        if (list.size() > 1) {
            s2 = list.get(1);
        }
        else {
            s2 = "";
        }
        this.printRecursive(printStream, j, "", s, s2);
    }
    
    private void doUsage(final PrintStream printStream) {
        printStream.println("Usage: dumpapp prefs <command> [command-options]");
        printStream.println("Usage: dumpapp prefs print [pathPrefix [keyPrefix]]");
        final StringBuilder sb = new StringBuilder("       dumpapp prefs ");
        sb.append("write <path> <key> <");
        final StringBuilder appendNamesList = Type.appendNamesList(sb, "|");
        appendNamesList.append("> <value>");
        printStream.println(appendNamesList);
        printStream.println();
        printStream.println("dumpapp prefs print: Print all matching values from the shared preferences");
        printStream.println();
        printStream.println("dumpapp prefs write: Writes a value to the shared preferences");
    }
    
    private void doWrite(final List<String> list) throws DumpUsageException {
        final Iterator<String> iterator = list.iterator();
        final String nextArg = nextArg(iterator, "Expected <path>");
        final String nextArg2 = nextArg(iterator, "Expected <key>");
        final Type of = Type.of(nextArg(iterator, "Expected <type>"));
        if (of != null) {
            final SharedPreferences$Editor edit = this.getSharedPreferences(nextArg).edit();
            switch (SharedPreferencesDumperPlugin$1.$SwitchMap$com$facebook$stetho$dumpapp$plugins$SharedPreferencesDumperPlugin$Type[of.ordinal()]) {
                case 6: {
                    putStringSet(edit, nextArg2, iterator);
                    break;
                }
                case 5: {
                    edit.putString(nextArg2, nextArgValue(iterator));
                    break;
                }
                case 4: {
                    edit.putFloat(nextArg2, (float)Float.valueOf(nextArgValue(iterator)));
                    break;
                }
                case 3: {
                    edit.putLong(nextArg2, (long)Long.valueOf(nextArgValue(iterator)));
                    break;
                }
                case 2: {
                    edit.putInt(nextArg2, (int)Integer.valueOf(nextArgValue(iterator)));
                    break;
                }
                case 1: {
                    edit.putBoolean(nextArg2, (boolean)Boolean.valueOf(nextArgValue(iterator)));
                    break;
                }
            }
            edit.commit();
            return;
        }
        throw new DumpUsageException(Type.appendNamesList(new StringBuilder("Usage: prefs write <path> <key> <type> <value>, where type is one of: "), ", ").toString());
    }
    
    private SharedPreferences getSharedPreferences(final String s) {
        return this.mAppContext.getSharedPreferences(s, 4);
    }
    
    private static String nextArg(final Iterator<String> iterator, final String s) throws DumpUsageException {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new DumpUsageException(s);
    }
    
    private static String nextArgValue(final Iterator<String> iterator) throws DumpUsageException {
        return nextArg(iterator, "Expected <value>");
    }
    
    private void printFile(final PrintStream printStream, final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(":");
        printStream.println(sb.toString());
        for (final Map.Entry<String, V> entry : SharedPreferencesHelper.getSharedPreferenceEntriesSorted(this.getSharedPreferences(s))) {
            if (entry.getKey().startsWith(s2)) {
                final StringBuilder k = a.k("  ");
                k.append(entry.getKey());
                k.append(" = ");
                k.append(entry.getValue());
                printStream.println(k.toString());
            }
        }
    }
    
    private void printRecursive(final PrintStream printStream, final String s, final String s2, final String s3, final String s4) {
        final File file = new File(s, s2);
        final boolean file2 = file.isFile();
        int i = 0;
        if (file2) {
            if (s2.endsWith(".xml")) {
                this.printFile(printStream, s2.substring(0, s2.length() - 4), s4);
            }
        }
        else if (file.isDirectory()) {
            final String[] list = file.list();
            if (list != null) {
                while (i < list.length) {
                    String string;
                    if (TextUtils.isEmpty((CharSequence)s2)) {
                        string = list[i];
                    }
                    else {
                        final StringBuilder k = a.k(s2);
                        k.append(File.separator);
                        k.append(list[i]);
                        string = k.toString();
                    }
                    if (string.startsWith(s3)) {
                        this.printRecursive(printStream, s, string, s3, s4);
                    }
                    ++i;
                }
            }
        }
    }
    
    private static void putStringSet(final SharedPreferences$Editor sharedPreferences$Editor, final String s, final Iterator<String> iterator) {
        final HashSet set = new HashSet();
        while (iterator.hasNext()) {
            set.add(iterator.next());
        }
        sharedPreferences$Editor.putStringSet(s, (Set)set);
    }
    
    @Override
    public void dump(final DumperContext dumperContext) throws DumpUsageException {
        final PrintStream stdout = dumperContext.getStdout();
        final List<String> argsAsList = dumperContext.getArgsAsList();
        String s;
        if (argsAsList.isEmpty()) {
            s = "";
        }
        else {
            s = argsAsList.remove(0);
        }
        if (s.equals("print")) {
            this.doPrint(stdout, argsAsList);
        }
        else if (s.equals("write")) {
            this.doWrite(argsAsList);
        }
        else {
            this.doUsage(stdout);
        }
    }
    
    @Override
    public String getName() {
        return "prefs";
    }
    
    public enum Type
    {
        BOOLEAN("boolean"), 
        FLOAT("float"), 
        INT("int"), 
        LONG("long"), 
        SET("set"), 
        STRING("string");
        
        private final String name;
        
        private Type(final String name) {
            this.name = name;
        }
        
        public static StringBuilder appendNamesList(final StringBuilder sb, final String s) {
            final Type[] values = values();
            final int length = values.length;
            int n = 1;
            for (final Type type : values) {
                if (n != 0) {
                    n = 0;
                }
                else {
                    sb.append(s);
                }
                sb.append(type.name);
            }
            return sb;
        }
        
        public static Type of(final String s) {
            for (final Type type : values()) {
                if (type.name.equals(s)) {
                    return type;
                }
            }
            return null;
        }
    }
}
