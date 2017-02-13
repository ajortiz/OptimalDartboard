package combinatorics;

THE COMPILER IS NOT GOING TO LIKE THIS FILE AS IS…
public class PermutationUtils
{
	public static <E> List<E> getCycle(Permutation<E> permutation, E e)
	
	public static <E> Permutation<E> getInverse(Permutation<E> permutation)
	
	//part of pre: permutation2.getDomain().containsAll(permutation1.getDomain())
	//post: rv = permutation1*permutation2, that is, 
	//rv.getImage(e) = permutation1.getImage(permutation2.getImage(e)) for all e in permutation2.getDomain()
	public static <E> Permutation<E> compose(Permutation<E> permutation1, Permutation<E> permutation2)
	
	//part of post: rv = "permutation.getImage(e) != e
	//				(for all e in permutation.getDomain())"
	public static <E> boolean isCyclic(Permutation<E> permutation)
}