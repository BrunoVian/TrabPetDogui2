/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.unipar.frameworks.hibernatemaven.frames;

import br.com.unipar.frameworks.model.dao.PetDAO;
import br.com.unipar.frameworks.model.Pet;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author not
 */
public class CadPetTest {
    
    public CadPetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of excluirPet method, of class CadPet.
     */
    @Test
    public void testExcluirPet() {
        System.out.println("excluirPet");
        CadPet instance = new CadPet();
        instance.excluirPet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarPet method, of class CadPet.
     */
    @Test
    public void testSalvarPet() {
        System.out.println("salvarPet");
        CadPet instance = new CadPet();
        instance.salvarPet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpaCampos method, of class CadPet.
     */
    @Test
    public void testLimpaCampos() {
        System.out.println("salvarPet");
        CadPet instance = new CadPet();

        instance.getjTextFieldNome().setText("Rex");
        instance.getjTextFieldTamanho().setText("Médio");
        instance.getjComboBoxSexo().setSelectedItem("Macho");
        instance.getjTextAreaObs().setText("Cachorro dócil");

        instance.salvarPet();

        PetDAO petDAO = new PetDAO();
        List<Pet> pets = petDAO.findAll();
        boolean found = false;
        for (Pet pet : pets) {
            if (pet.getNome().equals("Rex")
                    && pet.getTamanho().equals("Médio")
                    && pet.getSexo().equals("Macho")
                    && pet.getObservacao().equals("Cachorro dócil")) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CadPet.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
