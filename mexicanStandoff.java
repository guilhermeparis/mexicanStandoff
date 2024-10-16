public class MexicanStandoff
{
    public static void main(String[] args)
    {
        // Verifica se o número correto de argumentos foi passado
        if (args.length != 3)
        {
            System.out.println("Deve passar exatamente 3 números inteiros como argumento.");
            return;
        }
        try
        {
            // Converte os argumentos para inteiros
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int n3 = Integer.parseInt(args[2]);
            // Exibe os números digitados
            System.out.println("Valores: " + n1 + ", " + n2 + ", " + n3);
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: Todos os argumentos devem ser números inteiros.");
        }
    }
}