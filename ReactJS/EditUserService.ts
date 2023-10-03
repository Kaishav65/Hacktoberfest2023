import { Code } from '@core/common/code/Code';
import { Exception } from '@core/common/exception/Exception';
import { CoreAssert } from '@core/common/util/assert/CoreAssert';
import { User } from '@core/domain/user/entity/User';
import { UserRepositoryPort } from '@core/domain/user/port/persistence/UserRepositoryPort';
import { EditUserPort } from '@core/domain/user/port/usecase/EditUserPort';
import { UserUseCaseDto } from '@core/domain/user/usecase/dto/UserUseCaseDto';
import { EditUserUseCase } from '@core/domain/user/usecase/EditUserUseCase';


export class EditUserService implements EditUserUseCase {
  
    constructor(
      private readonly userRepository: UserRepositoryPort,
    ) {}
    
    public async execute(payload: EditUserPort): Promise<UserUseCaseDto> {
      const user: User = CoreAssert.notEmpty( await this.userRepository.findUser({id: payload.id,email: payload.email,}),Exception.new({code: Code.ENTITY_NOT_FOUND_ERROR,overrideMessage:"User not found!!"}));
    //   CoreAssert.isFalse(doesUserExist, Exception.new({code: Code.ENTITY_ALREADY_EXISTS_ERROR, overrideMessage: 'User already exists.'}));
  
    //   const user: User = await User.new({
    //     id:payload.id,
    //     firstName: payload.firstName,
    //     lastName: payload.lastName,
    //     email: payload.email,
    //     role: payload.role,
    //     password: payload.password,
    //   });

       await user.edit({id: payload.id, firstName: payload.firstName, lastName: payload.lastName, email: payload.email, password: payload.password})
      
      await this.userRepository.updateUser(user);
      
      return UserUseCaseDto.newFromUser(user);
    }
    
  }
  