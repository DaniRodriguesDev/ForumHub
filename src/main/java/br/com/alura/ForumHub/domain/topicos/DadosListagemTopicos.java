package br.com.alura.ForumHub.domain.topicos;

public record DadosListagemTopicos(Long id, String titulo, String mensagem, String autor, Cursos cursos) {

    public DadosListagemTopicos(Topicos topicos){
        this(topicos.getId(), topicos.getTitulo(), topicos.getMensagem(), topicos.getAutor(), topicos.getCurso());
    }
}