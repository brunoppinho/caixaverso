
**Tabela comparativa:**

| Característica | HashMap | TreeMap | LinkedHashMap |
|----------------|---------|---------|---------------|
| **Ordem** | Não garante | Alfabética (chaves) | Inserção |
| **Complexidade get/put** | O(1) | O(log n) | O(1) |
| **Permite null na chave** | Sim (1 vez) | Não | Sim (1 vez) |
| **Uso de memória** | Média | Alta | Alta |
| **Quando usar** | Padrão | Precisa ordem | Precisa ordem inserção |


### Comparação completa

| Característica | HashSet | TreeSet | LinkedHashSet |
|----------------|---------|---------|---------------|
| **Ordem** | Não garante | Ordenado (natural) | Inserção |
| **Performance** | O(1) | O(log n) | O(1) |
| **Memória** | Média | Alta | Alta |
| **Quando usar** | Padrão | Precisa ordem | Precisa ordem inserção |
| **Permite null** | Sim (1) | Não | Sim (1) |
