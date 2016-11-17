Calculator myArrayCopier = new ArrayCopier()

int[] src1 = [1, 2, 3, 4, 5, 6, 7]
int[] dst1 = new int[7]
println myArrayCopier.copy(src1, dst1)
int[] src2 = [1, 2, 3, 4, 5, 6, 7]
int[] dst2 = new int[9]
println myArrayCopier.copy(src2, dst2)
int[] src3 = [1, 2, 3, 4, 5, 6, 7]
int[] dst3 = new int[4]
println myArrayCopier.copy(src3,dst3)