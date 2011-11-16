/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package net.codjo.tokio;
import junit.framework.TestCase;
/**
 * Classe supportant une TokioFixture pour les tests BD.  SI des traitements particuliers doivent �tre ajout�s
 * avant ou apr�s un test, surcharger les m�thodes {@link #doSetup()} et/ou {@link #doTearDown()}, les
 * m�thodes {@link TokioTestCase#setUp()} et/ou {@link TokioTestCase#tearDown()} �tant volontairement
 * finales.
 */
public abstract class TokioTestCase extends TestCase {
    protected TokioFixture tokioFixture;


    /**
     * .
     *
     * @see #doSetup()
     */
    @Override
    protected final void setUp() throws Exception {
        tokioFixture = new TokioFixture(getClass());
        tokioFixture.doSetUp();
        doSetup();
    }


    protected void doSetup() throws Exception {
    }


    /**
     * .
     *
     * @see #doTearDown()
     */
    @Override
    protected final void tearDown() throws Exception {
        doTearDown();
        tokioFixture.doTearDown();
    }


    protected void doTearDown() throws Exception {
    }
}
