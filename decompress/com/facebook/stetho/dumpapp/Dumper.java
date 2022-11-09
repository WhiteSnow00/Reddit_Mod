// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.dumpapp;

import java.util.HashMap;
import java.io.OutputStream;
import java.io.PrintWriter;
import uk2.c;
import a40.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.CommandLine;
import java.io.PrintStream;
import java.io.InputStream;
import uk2.b;
import uk2.a;
import java.util.Map;

public class Dumper
{
    private final Map<String, DumperPlugin> mDumperPlugins;
    private final GlobalOptions mGlobalOptions;
    private final a mParser;
    
    public Dumper(final Iterable<DumperPlugin> iterable) {
        this(iterable, (a)new b());
    }
    
    public Dumper(final Iterable<DumperPlugin> iterable, final a mParser) {
        this.mDumperPlugins = generatePluginMap(iterable);
        this.mParser = mParser;
        this.mGlobalOptions = new GlobalOptions();
    }
    
    private int doDump(final InputStream inputStream, final PrintStream printStream, final PrintStream printStream2, final String[] array) throws ParseException, DumpException {
        final CommandLine a = this.mParser.a(this.mGlobalOptions.options, array);
        if (a.hasOption(this.mGlobalOptions.optionHelp.getOpt())) {
            this.dumpUsage(printStream);
            return 0;
        }
        if (a.hasOption(this.mGlobalOptions.optionListPlugins.getOpt())) {
            this.dumpAvailablePlugins(printStream);
            return 0;
        }
        if (!a.getArgList().isEmpty()) {
            this.dumpPluginOutput(inputStream, printStream, printStream2, a);
            return 0;
        }
        this.dumpUsage(printStream2);
        return 1;
    }
    
    private void dumpAvailablePlugins(final PrintStream printStream) {
        final ArrayList list = new ArrayList();
        final Iterator<DumperPlugin> iterator = this.mDumperPlugins.values().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getName());
        }
        Collections.sort((List<Comparable>)list);
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            printStream.println((String)iterator2.next());
        }
    }
    
    private void dumpPluginOutput(final InputStream inputStream, final PrintStream printStream, final PrintStream printStream2, final CommandLine commandLine) throws DumpException {
        final ArrayList list = new ArrayList(commandLine.getArgList());
        if (list.size() < 1) {
            throw new DumpException("Expected plugin argument");
        }
        final String s = list.remove(0);
        final DumperPlugin dumperPlugin = this.mDumperPlugins.get(s);
        if (dumperPlugin != null) {
            dumperPlugin.dump(new DumperContext(inputStream, printStream, printStream2, this.mParser, list));
            return;
        }
        throw new DumpException(f.n("No plugin named '", s, "'"));
    }
    
    private void dumpUsage(PrintStream printStream) {
        final c c = new c();
        printStream.println("Usage: dumpapp [options] <plugin> [plugin-options]");
        printStream = (PrintStream)new PrintWriter(printStream);
        try {
            c.c((PrintWriter)printStream, this.mGlobalOptions.options);
        }
        finally {
            ((PrintWriter)printStream).flush();
        }
    }
    
    private static Map<String, DumperPlugin> generatePluginMap(final Iterable<DumperPlugin> iterable) {
        final HashMap hashMap = new HashMap();
        for (final DumperPlugin dumperPlugin : iterable) {
            hashMap.put(dumperPlugin.getName(), dumperPlugin);
        }
        return (Map<String, DumperPlugin>)Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public int dump(final InputStream inputStream, final PrintStream printStream, final PrintStream printStream2, final String[] array) {
        try {
            return this.doDump(inputStream, printStream, printStream2, array);
        }
        catch (final RuntimeException ex) {
            ex.printStackTrace(printStream2);
            return 1;
        }
        catch (final DumpappOutputBrokenException ex2) {
            throw ex2;
        }
        catch (final DumpException ex3) {
            printStream2.println(ex3.getMessage());
            return 1;
        }
        catch (final ParseException ex4) {
            printStream2.println(((Throwable)ex4).getMessage());
            this.dumpUsage(printStream2);
            return 1;
        }
    }
}
