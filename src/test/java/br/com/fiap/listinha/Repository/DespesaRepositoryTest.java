package br.com.fiap.listinha.Repository;

/*
@RunWith(SpringRunner.class)
@DataJpaTest

public class DespesaRepositoryTest {

    @Autowired
    private DespesaRepository repository;

    @Autowired
    private TestEntityManager em;
    @Test
    void findAllByStatusContainingIgnoreCase() {
        String statusDespesa = "pago";

        DespesaEntity pago = new DespesaEntity();
        pago.setStatus(statusDespesa);
        em.persist(pago);

        DespesaEntity despesa = (DespesaEntity) repository.findAllByStatusContainingIgnoreCase(statusDespesa);
        Assert.assertNotNull(repository);
        Assert.assertEquals(statusDespesa, despesa.getStatus());

    }

    @Test
    void findByName() {
        String nomeDespesa = "conta";
        DespesaEntity nome = repository.findByName(nomeDespesa);
        Assert.assertNotNull(repository);
        Assert.assertEquals(nomeDespesa, nome.getName());
    }

    @Test
    void findAllByCategoriaContainingIgnoreCase() {
    }

    @Test
    void findAllByNameContainingIgnoreCase() {
    }
}*/