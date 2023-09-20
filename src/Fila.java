    public class Fila {
        private void imprimeDocumento()
        {

        }

        private void removeDocumento()
        {

        }

        private void removeTodosDocumentos()
        {

        }

        private static Fila instancia = null;
        private Fila()
        {

        }

        public  static Fila getInstance(){

            if (instancia == null)
            {
                instancia = new Fila();
            }
            return instancia;
        }
    }
