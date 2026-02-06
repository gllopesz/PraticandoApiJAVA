public record Endereco (String logradouro, String bairro, String localidade, String uf, String cep) {


    public String formatado() {
        return
                """
                Rua: %s
                Bairro: %s
                Cidade: %s
                Uf: %s
                Cep: %s     
                """.formatted(logradouro, bairro, localidade, uf, cep);
    }
}

