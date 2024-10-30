package service;

public class UserService {
    
    @Autowired
    private final UsuarioRepository usuarioRepository;

    public UserService (UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario guardarUsuario() {
        System.out.println("Guardando usuario...");
        System.out.println("Usuario guardado!");
    }
}
